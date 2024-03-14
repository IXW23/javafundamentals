package com.fundamentals.labs;

public class EnumExercise {
    public void favMovieGenre(MoviesEnum genre) {
        String msg = "My favorite Movie Genre is ";
        switch(genre) {
            case HORROR:
                msg += "Horror";
                break;
            case ROMANCE:
                msg += "Romance";
                break;
            case COMEDY:
                msg += "Comedy";
                break;
            case ACTION:
                msg += "Action";
                break;
            case SPORTS:
                msg += "Sports";
                break;
            case THRILLER:
                msg += "Thriller";
                break;
            default:
                msg += "Mystery";
        }
        System.out.println(msg + ".");
    }

    public static void main(String[] args) {
        EnumExercise myEnumExercise = new EnumExercise();
        myEnumExercise.favMovieGenre(MoviesEnum.ACTION);
    }
}
