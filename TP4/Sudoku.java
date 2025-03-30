package TP4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class SudokuException extends Exception {
    public SudokuException(String message) {
        super(message);
    }
}

public class Sudoku {
    private int[][] grid;

    public Sudoku() {
        grid = new int[9][9];
        // Initialiser la grille avec des zéros
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = 0;
            }
        }
    }

    // Charger depuis un Reader (fichier ou stdin)
    public void loadFromReader(Reader reader) throws IOException, SudokuException {
        try (BufferedReader br = new BufferedReader(reader)) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] groups = line.trim().split("\\s+");
                for (String group : groups) {
                    // Vérifier le format (exactement 3 chiffres)
                    if (!group.matches("\\d{3}")) {
                        throw new SudokuException(
                            String.format("Ligne %d: Format invalide '%s' (doit être 3 chiffres)", lineNumber, group));
                    }

                    int row = Character.getNumericValue(group.charAt(0));
                    int col = Character.getNumericValue(group.charAt(1));
                    int value = Character.getNumericValue(group.charAt(2));

                    // Vérifier les plages de valeurs
                    if (row < 0 || row > 8) {
                        throw new SudokuException(
                            String.format("Ligne %d: Ligne invalide '%d' dans '%s'", lineNumber, row, group));
                    }
                    if (col < 0 || col > 8) {
                        throw new SudokuException(
                            String.format("Ligne %d: Colonne invalide '%d' dans '%s'", lineNumber, col, group));
                    }
                    if (value < 1 || value > 9) {
                        throw new SudokuException(
                            String.format("Ligne %d: Valeur invalide '%d' dans '%s'", lineNumber, value, group));
                    }

                    // Vérifier si la case est déjà remplie
                    if (grid[row][col] != 0) {
                        throw new SudokuException(
                            String.format("Ligne %d: Case (%d,%d) déjà remplie avec %d", lineNumber, row, col, grid[row][col]));
                    }

                    grid[row][col] = value;

                    // Valider immédiatement après chaque insertion
                    validateRowAndColumn(row, col);
                }
            }
        }
    }

    // Charger depuis un fichier
    public void loadFromFile(String filePath) throws IOException, SudokuException {
        try (FileReader reader = new FileReader(filePath)) {
            loadFromReader(reader);
        }
    }

    // Charger depuis l'entrée standard
    public void loadFromStdin() throws IOException, SudokuException {
        loadFromReader(new InputStreamReader(System.in));
    }

    // Valider une ligne et une colonne spécifiques
    private void validateRowAndColumn(int row, int col) throws SudokuException {
        // Vérifier la ligne
        for (int j = 0; j < 9; j++) {
            if (j != col && grid[row][j] == grid[row][col]) {
                throw new SudokuException(
                    String.format("Valeur %d en double dans la ligne %d", grid[row][col], row));
            }
        }

        // Vérifier la colonne
        for (int i = 0; i < 9; i++) {
            if (i != row && grid[i][col] == grid[row][col]) {
                throw new SudokuException(
                    String.format("Valeur %d en double dans la colonne %d", grid[row][col], col));
            }
        }
    }

    // Transposer la matrice
    public void transpose() {
        int[][] transposed = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                transposed[i][j] = grid[j][i];
            }
        }
        grid = transposed;
    }

    // Afficher la grille
    public void display() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("- - - - - - - - - - - -");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[i][j] == 0 ? ". " : grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            // Mode stdin
            System.out.println("Lecture depuis l'entrée standard. Entrez les triplets de chiffres :");
            Sudoku sudoku = new Sudoku();
            try {
                sudoku.loadFromStdin();
                System.out.println("\nGrille initiale :");
                sudoku.display();
                
                System.out.println("\nGrille transposée :");
                sudoku.transpose();
                sudoku.display();
            } catch (IOException e) {
                System.out.println("Erreur lors de la lecture : " + e.getMessage());
            } catch (SudokuException e) {
                System.out.println("Erreur de validation Sudoku : " + e.getMessage());
            }
        } else {
            // Mode fichier
            for (String filePath : args) {
                System.out.println("\nTest avec " + filePath + " :");
                System.out.println("=".repeat(50));
                
                Sudoku sudoku = new Sudoku();
                try {
                    sudoku.loadFromFile(filePath);
                    System.out.println("Grille initiale :");
                    sudoku.display();
                    
                    System.out.println("\nGrille transposée :");
                    sudoku.transpose();
                    sudoku.display();
                } catch (IOException e) {
                    System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
                } catch (SudokuException e) {
                    System.out.println("Erreur de validation Sudoku : " + e.getMessage());
                }
                System.out.println("=".repeat(50) + "\n");
            }
        }
    }
}
