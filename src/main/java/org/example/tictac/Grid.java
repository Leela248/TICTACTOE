package org.example.tictac;
import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<List<Symbol>> grid = new ArrayList<>();

    public Grid() {
        for (int r = 0; r < 3; r++) {
            List<Symbol> temp = new ArrayList<>();
            for (int c = 0; c < 3; c++) {
                temp.add(Symbol.NONE);
            }
            grid.add(temp);
        }
    }

    public boolean setCell(int row, int col, Symbol s ){
        grid.get(row).set(col,s);
        print();
        return validate(row, col, s);
    }

    private void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println(grid.get(i));
        }
    }

    public Symbol getCell(int i, int j){
        return grid.get(i).get(j);
    }

    public boolean isGridFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(this.getCell(i, j) == Symbol.NONE){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validate(int row, int col, Symbol s){
        int r = 0, c = 0, l = 0, m = 0;
        for( int i = 0 ; i < 3 ; i++ ){
            if(grid.get(row).get(i) == s) {
                r++;
                if( r == 3 ) return true;
            }
        }
        for( int j = 0 ; j < 3 ; j++ ){
            if(grid.get(j).get(col) == s){
                c++;
                if( c == 3 ) return true;
            }
        }
        for( int i = 0 ; i < 3 ; i++ ){
            if(grid.get(i).get(i) == s) {
                l++;
                if( l == 3 ) return true;
            }
        }
        for( int i = 0 ; i < 3 ; i++ ){
            if(grid.get(i).get(3 - i - 1) == s) {
                m++;
                if( m == 3 ) return true;
            }
        }
        return false;
    }
}
