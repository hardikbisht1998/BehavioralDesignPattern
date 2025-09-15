package mementoPattern;

public class ChessBoard {

    private ChessPieces[][] board;
    private long blackTime;
    private long whiteTime;

    public ChessBoard() {
        blackTime = 0;
        whiteTime = 0;
        board = new ChessPieces[8][8];
        setDefault();
    }


    public ChessBoard(ChessBoard other) {
        this.whiteTime = other.whiteTime;
        this.blackTime = other.blackTime;

        this.board = new ChessPieces[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.board[i][j] = other.board[i][j]; // Enum = safe to copy by reference
            }
        }
    }

    void setDefault() {
        for (int i = 0; i < 8; i++) {
            board[1][i] = ChessPieces.BPAWN;
            board[6][i] = ChessPieces.WPAWN;
        }
        board[0][0] = ChessPieces.BROOKR;
        board[0][7] = ChessPieces.BROOKL;
        board[7][7] = ChessPieces.WROOKR;
        board[7][0] = ChessPieces.WROOKL;

        board[7][2] = ChessPieces.WBISHOPL;
        board[7][5] = ChessPieces.WBISHOPR;
        board[0][2] = ChessPieces.BBISHOPR;
        board[0][5] = ChessPieces.BBISHOPL;

        board[7][1] = ChessPieces.BKNIGHTR;
        board[7][6] = ChessPieces.BKNIGHTL;
        board[0][1] = ChessPieces.WKNIGHTL;
        board[0][6] = ChessPieces.WKNIGHTR;

        board[7][3] = ChessPieces.WKING;
        board[7][4] = ChessPieces.WQUEEN;
        board[0][3] = ChessPieces.BQUEEN;
        board[0][4] = ChessPieces.BKING;
        for (int i = 0; i < 8; i++) {
            board[2][i] = ChessPieces.BLANK;
            board[3][i] = ChessPieces.BLANK;
            board[4][i] = ChessPieces.BLANK;
            board[5][i] = ChessPieces.BLANK;
        }

    }

    public ChessPieces[][] getBoard() {
        return board;
    }



    public void setBoard(ChessPieces[][] board) {
        this.board = board;
    }


    public long getWhiteTime() {
        return whiteTime;
    }

    public void setWhiteTime(long whiteTime) {
        this.whiteTime = whiteTime;
    }

    public long getBlackTime() {
        return blackTime;
    }

    public void setBlackTime(long blackTime) {
        this.blackTime = blackTime;
    }



    public ChessPieces getCheckPiece(int i, int j) {
        return board[i][j];
    }

    public void nextMove(ChessPieces chessPiece, int row, int col) {
        board[row][col] = chessPiece;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Black Time: ").append(blackTime).append("\n");
//        sb.append("White Time: ").append(whiteTime).append("\n");
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                sb.append(board[i][j]).append("\t");
//            }
//            sb.append("\n");
//        }
//
//        return sb.toString();
//    }


//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Black Time: ").append(blackTime).append("\n");
//        sb.append("White Time: ").append(whiteTime).append("\n\n");
//
//        // File labels
//        sb.append("    a   b   c   d   e   f   g   h\n");
//        sb.append("  +---+---+---+---+---+---+---+---+\n");
//
//        for (int rank = 7; rank >= 0; rank--) {            // rank 8..1
//            sb.append(rank + 1).append(" |");
//            for (int file = 0; file < 8; file++) {          // file a..h
//                ChessPieces p = board[rank][file];
//                sb.append(" ").append(symbol(p)).append(" |");
//            }
//            sb.append(" ").append(rank + 1).append("\n");
//            sb.append("  +---+---+---+---+---+---+---+---+\n");
//        }
//
//        sb.append("    a   b   c   d   e   f   g   h\n");
//        return sb.toString();
//    }
//
//    /**
//     * Maps your enum to a compact printable symbol.
//     * Adjust mapping to your exact enum semantics.
//     */
//    private String symbol(ChessPieces p) {
//        if (p == null || p == ChessPieces.BLANK) return ".";
//        switch (p) {
//            // Black pieces (uppercase here; change to lowercase if you prefer)
//            case BKING:     return "K";
//            case BQUEEN:    return "Q";
//            case BBISHOPL:
//            case BBISHOPR:  return "B";
//            case BKNIGHTL:
//            case BKNIGHTR:  return "N";
//            case BROOKL:
//            case BROOKR:    return "R";
//            case BPAWN:     return "P";
//
//            // White pieces (lowercase here to distinguish)
//            case WKING:     return "k";
//            case WQUEEN:    return "q";
//            case WBISHOPL:
//            case WBISHOPR:  return "b";
//            case WKNIGHTL:
//            case WKNIGHTR:  return "n";
//            case WROOKL:
//            case WROOKR:    return "r";
//            case WPAWN:     return "p";
//
//            default:        return "?";
//        }
//    }


//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Black Time: ").append(blackTime).append("\n");
//        sb.append("White Time: ").append(whiteTime).append("\n\n");
//
//        // File labels
//        sb.append("    a   b   c   d   e   f   g   h\n");
//        sb.append("  +---+---+---+---+---+---+---+---+\n");
//
//        for (int rank = 7; rank >= 0; rank--) {            // rank 8..1 (top to bottom)
//            sb.append(rank + 1).append(" |");
//            for (int file = 0; file < 8; file++) {          // file a..h (left to right)
//                ChessPieces p = board[rank][file];
//                sb.append(" ").append(symbol(p)).append(" |");
//            }
//            sb.append(" ").append(rank + 1).append("\n");
//            sb.append("  +---+---+---+---+---+---+---+---+\n");
//        }
//
//        sb.append("    a   b   c   d   e   f   g   h\n");
//        return sb.toString();
//    }
//
//    /**
//     * Map enum to Unicode chess symbols.
//     * White: ♔(K) ♕(Q) ♖(R) ♗(B) ♘(N) ♙(P)
//     * Black: ♚(K) ♛(Q) ♜(R) ♝(B) ♞(N) ♟(P)
//     * Empty: ·
//     */
//    private String symbol(ChessPieces p) {
//        if (p == null || p == ChessPieces.BLANK) return "·";
//
//        switch (p) {
//            // Black pieces
//            case BKING:      return "♚";
//            case BQUEEN:     return "♛";
//            case BROOKL:
//            case BROOKR:     return "♜";
//            case BBISHOPL:
//            case BBISHOPR:   return "♝";
//            case BKNIGHTL:
//            case BKNIGHTR:   return "♞";
//            case BPAWN:      return "♟";
//
//            // White pieces
//            case WKING:      return "♔";
//            case WQUEEN:     return "♕";
//            case WROOKL:
//            case WROOKR:     return "♖";
//            case WBISHOPL:
//            case WBISHOPR:   return "♗";
//            case WKNIGHTL:
//            case WKNIGHTR:   return "♘";
//            case WPAWN:      return "♙";
//
//            default:         return "?";
//        }
//    }

    private static final String EMPTY = "••";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Black Time: ").append(blackTime).append("\n");
        sb.append("White Time: ").append(whiteTime).append("\n\n");

        sb.append("    a    b    c    d    e    f    g   h\n");
        sb.append("  +----+----+----+----+----+----+----+----+\n");
        for (int rank = 7; rank >= 0; rank--) {
            sb.append(rank + 1).append(" |");
            for (int file = 0; file < 8; file++) {
                String s = symbol(board[rank][file]);
                // force width: one space, glyph, one space
                sb.append(String.format(" %s |", s));
            }
            sb.append(" ").append(rank + 1).append("\n");
            sb.append("  +----+----+----+----+----+----+----+----+\n");
        }
        sb.append("     a    b    c    d    e    f    g    h\n");
        return sb.toString();
    }

    private String symbol(ChessPieces p) {
        if (p == null || p == ChessPieces.BLANK) return EMPTY;
        switch (p) {
            case BKING:
                return "♚";
            case BQUEEN:
                return "♛";
            case BROOKL:
            case BROOKR:
                return "♜";
            case BBISHOPL:
            case BBISHOPR:
                return "♝";
            case BKNIGHTL:
            case BKNIGHTR:
                return "♞";
            case BPAWN:
                return "♟";
            case WKING:
                return "♔";
            case WQUEEN:
                return "♕";
            case WROOKL:
            case WROOKR:
                return "♖";
            case WBISHOPL:
            case WBISHOPR:
                return "♗";
            case WKNIGHTL:
            case WKNIGHTR:
                return "♘";
            case WPAWN:
                return "♙";
            default:
                return "?";
        }
    }


}
