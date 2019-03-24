public class FilmIzlet {

    private String film;

    public FilmIzlet(String film) {
        this.film = film;

        System.out.println(this.film + " Filmini Seyrediyor...");
    }

    public String getFilm() {

        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
}
