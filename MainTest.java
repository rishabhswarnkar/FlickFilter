import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {

    @Test
    public void defaultTestAllMovies() throws Exception {
        assertEquals(Main.allMovies(10), "The Secret Life of Pets\n" +
                "Suicide Squad\n" +
                "Finding Dory\n" +
                "Jurassic World\n" +
                "Arrival\n" +
                "Split\n" +
                "Rings\n" +
                "Miss Peregrine's Home for Peculiar Children\n" +
                "xXx: Return of Xander Cage\n" +
                "Interstellar\n");
    }

    @Test
    public void defaultTestByGenre() throws Exception {
        assertEquals(Main.byGenre(35, 10), "The Secret Life of Pets\n" +
                "La La Land\n" +
                "Deadpool\n" +
                "Birdman\n" +
                "Big Hero 6\n" +
                "Zootopia\n" +
                "Neighbors 2: Sorority Rising\n" +
                "Forrest Gump\n" +
                "Now You See Me 2\n" +
                "Back to the Future\n");

    }

    @Test
    public void defaultTestByPopularity() throws Exception {
        assertEquals(Main.higherPopularity(10, 10),
                "The Secret Life of Pets\n" +
                        "Suicide Squad\n" +
                        "Finding Dory\n" +
                        "Jurassic World\n" +
                        "Arrival\n" +
                        "Split\n" +
                        "Rings\n" +
                        "Miss Peregrine's Home for Peculiar Children\n" +
                        "xXx: Return of Xander Cage\n" +
                        "Interstellar\n");

    }

    @Test
    public void defaultTestByVote() throws Exception {
        assertEquals(Main.higherVote(7, 10), "Interstellar\n" +
                "La La Land\n" +
                        "Mad Max: Fury Road\n" +
                        "Fantastic Beasts and Where to Find Them\n" +
                        "Hacksaw Ridge\n" +
                        "John Wick\n" +
                        "Rogue One: A Star Wars Story\n" +
                        "Guardians of the Galaxy\n" +
                        "Deadpool\n" +
                        "Whiplash");

    }

    @Test
    public void zeroAllMovies() throws Exception {
        assertEquals(Main.allMovies(0), "");
    }


    @Test
    public void zeroGenre1() throws Exception {
        assertEquals(Main.byGenre(10, 0), "");
    }


    @Test
    public void zeroGenre2() throws Exception {
        assertEquals(Main.byGenre(0,10), "");
    }

    @Test
    public void zeroGenre3() throws Exception {
        assertEquals(Main.byGenre(0,0), "");
    }
    
    @Test
    public void zeroPopularity1() throws Exception {
        assertEquals(Main.higherPopularity(10, 0), "");
    }


    @Test
    public void zeroPopularity2() throws Exception {
        assertEquals(Main.higherPopularity(0,10), "Jack Reacher: Never Go Back\n" +
                "Hacksaw Ridge\n" +
                "Doctor Strange\n" +
                "Guardians of the Galaxy\n" +
                "John Wick\n" +
                "Deadpool\n" +
                "The Dark Knight\n" +
                "Trolls\n" +
                "Star Wars: The Force Awakens\n" +
                "The Accountant");
    }


    @Test
    public void zeroPopularity3() throws Exception {
        assertEquals(Main.higherPopularity(0,0), "");
    }
    
    @Test
    public void zeroVote1() throws Exception {
        assertEquals(Main.higherVote(10, 0), "");
    }


    @Test
    public void zeroVote2() throws Exception {
        assertEquals(Main.higherVote(0,10), "Jack Reacher: Never Go Back\n" +
                "Hacksaw Ridge\n" +
                "Doctor Strange\n" +
                "Guardians of the Galaxy\n" +
                "John Wick\n" +
                "Deadpool\n" +
                "The Dark Knight\n" +
                "Trolls\n" +
                "Star Wars: The Force Awakens\n" +
                "The Accountant\n");
    }


    @Test
    public void zeroVote3() throws Exception {
        assertEquals(Main.higherVote(0,0), "");
    }


    @Test
    public void negativeAllMovies() throws Exception {
        assertEquals(Main.allMovies(-10), "");
    }
    
    
    @Test
    public void negativeGenre1() throws Exception {
        assertEquals(Main.byGenre(-10, 0), "");
    }


    @Test
    public void negativeGenre2() throws Exception {
        assertEquals(Main.byGenre(0,-10), "");
    }

    @Test
    public void negativeGenre3() throws Exception {
        assertEquals(Main.byGenre(-10,-10), "");
    }

    @Test
    public void negativePopularity1() throws Exception {
        assertEquals(Main.higherPopularity(-10, 0), "");
    }


    @Test
    public void negativePopularity2() throws Exception {
        assertEquals(Main.higherPopularity(0,-10), "");
    }


    @Test
    public void negativePopularity3() throws Exception {
        assertEquals(Main.higherPopularity(-10,-10), "");
    }

    @Test
    public void negativeVote1() throws Exception {
        assertEquals(Main.higherVote(-10, 0), "");
    }


    @Test
    public void negativeVote2() throws Exception {
        assertEquals(Main.higherVote(0,-10), "");
    }


    @Test
    public void negativeVote3() throws Exception {
        assertEquals(Main.higherVote(-10,-10), "");
    }


    @Test
    public void higherAllMovies() throws Exception {
        assertEquals(Main.allMovies(150), "");
    }


    @Test
    public void higherGenre1() throws Exception {
        assertEquals(Main.byGenre(150, 0), "");
    }


    @Test
    public void higherGenre2() throws Exception {
        assertEquals(Main.byGenre(0,150), "");
    }

    @Test
    public void higherGenre3() throws Exception {
        assertEquals(Main.byGenre(150,150), "");
    }

    @Test
    public void higherPopularity1() throws Exception {
        assertEquals(Main.higherPopularity(150, 0), "");
    }


    @Test
    public void higherPopularity2() throws Exception {
        assertEquals(Main.higherPopularity(0,150), "The Secret Life of Pets\n" +
                "Suicide Squad\n" +
                "Finding Dory\n" +
                "Jurassic World\n" +
                "Arrival\n" +
                "Split\n" +
                "Rings\n" +
                "Miss Peregrine's Home for Peculiar Children\n" +
                "xXx: Return of Xander Cage\n" +
                "Interstellar\n" +
                "La La Land\n" +
                "Mad Max: Fury Road\n" +
                "Fantastic Beasts and Where to Find Them\n" +
                "Hacksaw Ridge\n" +
                "Captain America: Civil War\n" +
                "Underworld: Blood Wars\n" +
                "Assassin's Creed\n" +
                "Passengers\n" +
                "The Girl on the Train\n" +
                "John Wick\n" +
                "Inferno\n" +
                "Rogue One: A Star Wars Story\n" +
                "Jack Reacher: Never Go Back\n" +
                "Guardians of the Galaxy\n" +
                "Deadpool\n" +
                "Doctor Strange\n" +
                "Whiplash\n" +
                "Batman v Superman: Dawn of Justice\n" +
                "Manchester by the Sea\n" +
                "Star Wars: The Force Awakens\n" +
                "Fifty Shades Darker\n" +
                "Birdman\n" +
                "The Shawshank Redemption\n" +
                "Inception\n" +
                "The Dark Knight\n" +
                "The Hobbit: The Battle of the Five Armies\n" +
                "The Imitation Game\n" +
                "Gone Girl\n" +
                "Nocturnal Animals\n" +
                "The Accountant\n" +
                "Fight Club\n" +
                "The Hunger Games: Mockingjay - Part 1\n" +
                "Terminator Genisys\n" +
                "Star Wars\n" +
                "Avatar\n" +
                "The Revenant\n" +
                "Lucy\n" +
                "Fury\n" +
                "The Martian\n" +
                "Trolls\n" +
                "Iron Man\n" +
                "The Ring Two\n" +
                "The Avengers\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl\n" +
                "The Maze Runner\n" +
                "The Lord of the Rings: The Fellowship of the Ring\n" +
                "Ant-Man\n" +
                "X-Men: Days of Future Past\n" +
                "The Ring\n" +
                "The Godfather\n" +
                "Harry Potter and the Philosopher's Stone\n" +
                "The Matrix\n" +
                "Big Hero 6\n" +
                "Pulp Fiction\n" +
                "Django Unchained\n" +
                "A Monster Calls\n" +
                "John Wick: Chapter Two\n" +
                "Hidden Figures\n" +
                "Avengers: Age of Ultron\n" +
                "Ex Machina\n" +
                "Edge of Tomorrow\n" +
                "X-Men: Apocalypse\n" +
                "Zootopia\n" +
                "The Dark Knight Rises\n" +
                "The Lord of the Rings: The Two Towers\n" +
                "Room\n" +
                "The Hateful Eight\n" +
                "Neighbors 2: Sorority Rising\n" +
                "Inglourious Basterds\n" +
                "Tomorrowland\n" +
                "Forrest Gump\n" +
                "London Has Fallen\n" +
                "Fifty Shades of Grey\n" +
                "Titanic\n" +
                "The Equalizer\n" +
                "Nightcrawler\n" +
                "Terminator 2: Judgment Day\n" +
                "The Lord of the Rings: The Return of the King\n" +
                "Batman Begins\n" +
                "Gravity\n" +
                "Now You See Me 2\n" +
                "Jane Got a Gun\n" +
                "Back to the Future\n" +
                "The Wolf of Wall Street\n" +
                "A Little Chaos\n" +
                "Chappie\n" +
                "Se7en\n" +
                "Memento\n" +
                "The Hobbit: An Unexpected Journey\n" +
                "Dawn of the Planet of the Apes\n" +
                "The Magnificent Seven\n" +
                "The Terminator\n" +
                "Insurgent\n" +
                "Kill Bill: Vol. 1\n" +
                "The Jungle Book\n" +
                "Kingsman: The Secret Service\n" +
                "Mission: Impossible - Rogue Nation\n" +
                "Don't Breathe\n" +
                "The Edge of Seventeen\n" +
                "The Lego Batman Movie\n" +
                "WALL·E\n" +
                "Sing\n" +
                "The Nice Guys\n" +
                "Up\n" +
                "Sully\n" +
                "Jaws\n" +
                "Spectre\n" +
                "Now You See Me\n" +
                "Iron Man 3\n" +
                "It Follows\n" +
                "Storks\n" +
                "Her\n" +
                "Minions\n" +
                "Shutter Island\n" +
                "Pixels\n" +
                "Alice in Wonderland\n" +
                "Alien\n" +
                "12 Years a Slave\n" +
                "The Hunger Games: Catching Fire\n" +
                "Trainspotting\n" +
                "Thor\n" +
                "Ghostbusters\n" +
                "The DUFF\n" +
                "Black Swan\n" +
                "Independence Day\n" +
                "Star Trek Beyond\n" +
                "The Godfather: Part II\n" +
                "Independence Day: Resurgence\n" +
                "San Andreas\n" +
                "Spider-Man\n" +
                "Harry Potter and the Deathly Hallows: Part 2\n" +
                "The Grand Budapest Hotel\n" +
                "Argo\n" +
                "Saving Private Ryan\n" +
                "Furious 7\n" +
                "Pirates of the Caribbean: At World's End\n" +
                "Southpaw\n" +
                "Kill Bill: Vol. 2\n" +
                "Raiders of the Lost Ark\n" +
                "Pirates of the Caribbean: On Stranger Tides\n");
    }


    @Test
    public void higherPopularity3() throws Exception {
        assertEquals(Main.higherPopularity(5,150), "The Secret Life of Pets\n" +
                "Suicide Squad\n" +
                "Finding Dory\n" +
                "Jurassic World\n" +
                "Arrival\n" +
                "Split\n" +
                "Rings\n" +
                "Miss Peregrine's Home for Peculiar Children\n" +
                "xXx: Return of Xander Cage\n" +
                "Interstellar\n" +
                "La La Land\n" +
                "Mad Max: Fury Road\n" +
                "Fantastic Beasts and Where to Find Them\n" +
                "Hacksaw Ridge\n" +
                "Captain America: Civil War\n" +
                "Underworld: Blood Wars\n" +
                "Assassin's Creed\n" +
                "Passengers\n" +
                "The Girl on the Train\n" +
                "John Wick\n" +
                "Inferno\n" +
                "Rogue One: A Star Wars Story\n" +
                "Jack Reacher: Never Go Back\n" +
                "Guardians of the Galaxy\n" +
                "Deadpool\n" +
                "Doctor Strange\n" +
                "Whiplash\n" +
                "Batman v Superman: Dawn of Justice\n" +
                "Manchester by the Sea\n" +
                "Star Wars: The Force Awakens\n" +
                "Fifty Shades Darker\n" +
                "Birdman\n" +
                "The Shawshank Redemption\n" +
                "Inception\n" +
                "The Dark Knight\n" +
                "The Hobbit: The Battle of the Five Armies\n" +
                "The Imitation Game\n" +
                "Gone Girl\n" +
                "Nocturnal Animals\n" +
                "The Accountant\n" +
                "Fight Club\n" +
                "The Hunger Games: Mockingjay - Part 1\n" +
                "Terminator Genisys\n" +
                "Star Wars\n" +
                "Avatar\n" +
                "The Revenant\n" +
                "Lucy\n" +
                "Fury\n" +
                "The Martian\n" +
                "Trolls\n" +
                "Iron Man\n" +
                "The Ring Two\n" +
                "The Avengers\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl\n" +
                "The Maze Runner\n" +
                "The Lord of the Rings: The Fellowship of the Ring\n" +
                "Ant-Man\n" +
                "X-Men: Days of Future Past\n" +
                "The Ring\n" +
                "The Godfather\n" +
                "Harry Potter and the Philosopher's Stone\n" +
                "The Matrix\n" +
                "Big Hero 6\n" +
                "Pulp Fiction\n" +
                "Django Unchained\n" +
                "A Monster Calls\n" +
                "John Wick: Chapter Two\n" +
                "Hidden Figures\n" +
                "Avengers: Age of Ultron\n" +
                "Ex Machina\n" +
                "Edge of Tomorrow\n" +
                "X-Men: Apocalypse\n" +
                "Zootopia\n" +
                "The Dark Knight Rises\n" +
                "The Lord of the Rings: The Two Towers\n" +
                "Room\n" +
                "The Hateful Eight\n" +
                "Neighbors 2: Sorority Rising\n" +
                "Inglourious Basterds\n" +
                "Tomorrowland\n" +
                "Forrest Gump\n" +
                "London Has Fallen\n" +
                "Fifty Shades of Grey\n" +
                "Titanic\n" +
                "The Equalizer\n" +
                "Nightcrawler\n" +
                "Terminator 2: Judgment Day\n" +
                "The Lord of the Rings: The Return of the King\n" +
                "Batman Begins\n" +
                "Gravity\n" +
                "Now You See Me 2\n" +
                "Jane Got a Gun\n" +
                "Back to the Future\n" +
                "The Wolf of Wall Street\n" +
                "A Little Chaos\n" +
                "Chappie\n" +
                "Se7en\n" +
                "Memento\n" +
                "The Hobbit: An Unexpected Journey\n" +
                "Dawn of the Planet of the Apes\n" +
                "The Magnificent Seven\n" +
                "The Terminator\n" +
                "Insurgent\n" +
                "Kill Bill: Vol. 1\n" +
                "The Jungle Book\n" +
                "Kingsman: The Secret Service\n" +
                "Mission: Impossible - Rogue Nation\n" +
                "Don't Breathe\n" +
                "The Edge of Seventeen\n" +
                "The Lego Batman Movie\n" +
                "WALL·E\n" +
                "Sing\n" +
                "The Nice Guys\n" +
                "Up\n" +
                "Sully\n" +
                "Jaws\n" +
                "Spectre\n" +
                "Now You See Me\n" +
                "Iron Man 3\n" +
                "It Follows\n" +
                "Storks\n" +
                "Her\n" +
                "Minions\n" +
                "Shutter Island\n" +
                "Pixels\n" +
                "Alice in Wonderland\n" +
                "Alien\n" +
                "12 Years a Slave\n" +
                "The Hunger Games: Catching Fire\n" +
                "Trainspotting\n" +
                "Thor\n" +
                "Ghostbusters\n" +
                "The DUFF\n" +
                "Black Swan\n" +
                "Independence Day\n" +
                "Star Trek Beyond\n" +
                "The Godfather: Part II\n" +
                "Independence Day: Resurgence\n" +
                "San Andreas\n" +
                "Spider-Man\n" +
                "Harry Potter and the Deathly Hallows: Part 2\n" +
                "The Grand Budapest Hotel\n" +
                "Argo\n" +
                "Saving Private Ryan\n" +
                "Furious 7\n" +
                "Pirates of the Caribbean: At World's End\n" +
                "Southpaw\n" +
                "Kill Bill: Vol. 2\n" +
                "Raiders of the Lost Ark\n" +
                "Pirates of the Caribbean: On Stranger Tides\n");
    }

    @Test
    public void higherVote1() throws Exception {
        assertEquals(Main.higherVote(150, 0), "");
    }


    @Test
    public void higherVote2() throws Exception {
        assertEquals(Main.higherVote(0,150), "The Secret Life of Pets\n" +
                "Suicide Squad\n" +
                "Finding Dory\n" +
                "Jurassic World\n" +
                "Arrival\n" +
                "Split\n" +
                "Rings\n" +
                "Miss Peregrine's Home for Peculiar Children\n" +
                "xXx: Return of Xander Cage\n" +
                "Interstellar\n" +
                "La La Land\n" +
                "Mad Max: Fury Road\n" +
                "Fantastic Beasts and Where to Find Them\n" +
                "Hacksaw Ridge\n" +
                "Captain America: Civil War\n" +
                "Underworld: Blood Wars\n" +
                "Assassin's Creed\n" +
                "Passengers\n" +
                "The Girl on the Train\n" +
                "John Wick\n" +
                "Inferno\n" +
                "Rogue One: A Star Wars Story\n" +
                "Jack Reacher: Never Go Back\n" +
                "Guardians of the Galaxy\n" +
                "Deadpool\n" +
                "Doctor Strange\n" +
                "Whiplash\n" +
                "Batman v Superman: Dawn of Justice\n" +
                "Manchester by the Sea\n" +
                "Star Wars: The Force Awakens\n" +
                "Fifty Shades Darker\n" +
                "Birdman\n" +
                "The Shawshank Redemption\n" +
                "Inception\n" +
                "The Dark Knight\n" +
                "The Hobbit: The Battle of the Five Armies\n" +
                "The Imitation Game\n" +
                "Gone Girl\n" +
                "Nocturnal Animals\n" +
                "The Accountant\n" +
                "Fight Club\n" +
                "The Hunger Games: Mockingjay - Part 1\n" +
                "Terminator Genisys\n" +
                "Star Wars\n" +
                "Avatar\n" +
                "The Revenant\n" +
                "Lucy\n" +
                "Fury\n" +
                "The Martian\n" +
                "Trolls\n" +
                "Iron Man\n" +
                "The Ring Two\n" +
                "The Avengers\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl\n" +
                "The Maze Runner\n" +
                "The Lord of the Rings: The Fellowship of the Ring\n" +
                "Ant-Man\n" +
                "X-Men: Days of Future Past\n" +
                "The Ring\n" +
                "The Godfather\n" +
                "Harry Potter and the Philosopher's Stone\n" +
                "The Matrix\n" +
                "Big Hero 6\n" +
                "Pulp Fiction\n" +
                "Django Unchained\n" +
                "A Monster Calls\n" +
                "John Wick: Chapter Two\n" +
                "Hidden Figures\n" +
                "Avengers: Age of Ultron\n" +
                "Ex Machina\n" +
                "Edge of Tomorrow\n" +
                "X-Men: Apocalypse\n" +
                "Zootopia\n" +
                "The Dark Knight Rises\n" +
                "The Lord of the Rings: The Two Towers\n" +
                "Room\n" +
                "The Hateful Eight\n" +
                "Neighbors 2: Sorority Rising\n" +
                "Inglourious Basterds\n" +
                "Tomorrowland\n" +
                "Forrest Gump\n" +
                "London Has Fallen\n" +
                "Fifty Shades of Grey\n" +
                "Titanic\n" +
                "The Equalizer\n" +
                "Nightcrawler\n" +
                "Terminator 2: Judgment Day\n" +
                "The Lord of the Rings: The Return of the King\n" +
                "Batman Begins\n" +
                "Gravity\n" +
                "Now You See Me 2\n" +
                "Jane Got a Gun\n" +
                "Back to the Future\n" +
                "The Wolf of Wall Street\n" +
                "A Little Chaos\n" +
                "Chappie\n" +
                "Se7en\n" +
                "Memento\n" +
                "The Hobbit: An Unexpected Journey\n" +
                "Dawn of the Planet of the Apes\n" +
                "The Magnificent Seven\n" +
                "The Terminator\n" +
                "Insurgent\n" +
                "Kill Bill: Vol. 1\n" +
                "The Jungle Book\n" +
                "Kingsman: The Secret Service\n" +
                "Mission: Impossible - Rogue Nation\n" +
                "Don't Breathe\n" +
                "The Edge of Seventeen\n" +
                "The Lego Batman Movie\n" +
                "WALL·E\n" +
                "Sing\n" +
                "The Nice Guys\n" +
                "Up\n" +
                "Sully\n" +
                "Jaws\n" +
                "Spectre\n" +
                "Now You See Me\n" +
                "Iron Man 3\n" +
                "It Follows\n" +
                "Storks\n" +
                "Her\n" +
                "Minions\n" +
                "Shutter Island\n" +
                "Pixels\n" +
                "Alice in Wonderland\n" +
                "Alien\n" +
                "12 Years a Slave\n" +
                "The Hunger Games: Catching Fire\n" +
                "Trainspotting\n" +
                "Thor\n" +
                "Ghostbusters\n" +
                "The DUFF\n" +
                "Black Swan\n" +
                "Independence Day\n" +
                "Star Trek Beyond\n" +
                "The Godfather: Part II\n" +
                "Independence Day: Resurgence\n" +
                "San Andreas\n" +
                "Spider-Man\n" +
                "Harry Potter and the Deathly Hallows: Part 2\n" +
                "The Grand Budapest Hotel\n" +
                "Argo\n" +
                "Saving Private Ryan\n" +
                "Furious 7\n" +
                "Pirates of the Caribbean: At World's End\n" +
                "Southpaw\n" +
                "Kill Bill: Vol. 2\n" +
                "Raiders of the Lost Ark\n" +
                "Pirates of the Caribbean: On Stranger Tides\n");
    }


    @Test
    public void higherVote3() throws Exception {
        assertEquals(Main.higherVote(7,150), "Interstellar\n" +
                "La La Land\n" +
                "Mad Max: Fury Road\n" +
                "Fantastic Beasts and Where to Find Them\n" +
                "Hacksaw Ridge\n" +
                "John Wick\n" +
                "Rogue One: A Star Wars Story\n" +
                "Guardians of the Galaxy\n" +
                "Deadpool\n" +
                "Whiplash\n" +
                "Manchester by the Sea\n" +
                "Star Wars: The Force Awakens\n" +
                "Birdman\n" +
                "The Shawshank Redemption\n" +
                "Inception\n" +
                "The Dark Knight\n" +
                "The Hobbit: The Battle of the Five Armies\n" +
                "The Imitation Game\n" +
                "Gone Girl\n" +
                "Nocturnal Animals\n" +
                "Fight Club\n" +
                "Star Wars\n" +
                "Avatar\n" +
                "The Revenant\n" +
                "Fury\n" +
                "The Martian\n" +
                "Iron Man\n" +
                "The Avengers\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl\n" +
                "The Maze Runner\n" +
                "The Lord of the Rings: The Fellowship of the Ring\n" +
                "Ant-Man\n" +
                "X-Men: Days of Future Past\n" +
                "The Godfather\n" +
                "Harry Potter and the Philosopher's Stone\n" +
                "The Matrix\n" +
                "Big Hero 6\n" +
                "Pulp Fiction\n" +
                "Django Unchained\n" +
                "Hidden Figures\n" +
                "Avengers: Age of Ultron\n" +
                "Ex Machina\n" +
                "Edge of Tomorrow\n" +
                "Zootopia\n" +
                "The Dark Knight Rises\n" +
                "The Lord of the Rings: The Two Towers\n" +
                "Room\n" +
                "The Hateful Eight\n" +
                "Inglourious Basterds\n" +
                "Forrest Gump\n" +
                "Titanic\n" +
                "The Equalizer\n" +
                "Nightcrawler\n" +
                "Terminator 2: Judgment Day\n" +
                "The Lord of the Rings: The Return of the King\n" +
                "Batman Begins\n" +
                "Gravity\n" +
                "Back to the Future\n" +
                "The Wolf of Wall Street\n" +
                "Se7en\n" +
                "Memento\n" +
                "Dawn of the Planet of the Apes\n" +
                "The Terminator\n" +
                "Kill Bill: Vol. 1\n" +
                "Kingsman: The Secret Service\n" +
                "Mission: Impossible - Rogue Nation\n" +
                "The Edge of Seventeen\n" +
                "The Lego Batman Movie\n" +
                "WALL·E\n" +
                "The Nice Guys\n" +
                "Up\n" +
                "Jaws\n" +
                "Now You See Me\n" +
                "Her\n" +
                "Shutter Island\n" +
                "Alien\n" +
                "12 Years a Slave\n" +
                "The Hunger Games: Catching Fire\n" +
                "Trainspotting\n" +
                "Black Swan\n" +
                "The Godfather: Part II\n" +
                "Harry Potter and the Deathly Hallows: Part 2\n" +
                "The Grand Budapest Hotel\n" +
                "Argo\n" +
                "Saving Private Ryan\n" +
                "Furious 7\n" +
                "Southpaw\n" +
                "Kill Bill: Vol. 2\n" +
                "Raiders of the Lost Ark\n" +
                "Blade Runner\n" +
                "Eternal Sunshine of the Spotless Mind\n" +
                "Hell or High Water\n" +
                "The Big Lebowski\n" +
                "The Hobbit: The Desolation of Smaug\n" +
                "American Sniper\n" +
                "E.T. the Extra-Terrestrial\n" +
                "The Green Mile\n" +
                "Life of Pi\n" +
                "The Departed\n" +
                "Toy Story\n" +
                "Casino Royale\n" +
                "The Truman Show\n" +
                "Frozen\n" +
                "Lion\n" +
                "The Empire Strikes Back\n" +
                "Harry Potter and the Deathly Hallows: Part 1\n" +
                "Your Name.\n" +
                "Die Hard\n" +
                "Creed\n" +
                "Indiana Jones and the Last Crusade\n" +
                "Leon: The Professional\n" +
                "Braveheart\n" +
                "Harry Potter and the Goblet of Fire\n" +
                "V for Vendetta\n" +
                "The Prestige\n" +
                "Maleficent\n" +
                "Goodfellas\n" +
                "Inside Out\n" +
                "The Bourne Identity\n" +
                "Prisoners\n" +
                "Harry Potter and the Order of the Phoenix\n" +
                "Schindler's List\n" +
                "Toy Story 3\n" +
                "Harry Potter and the Half-Blood Prince\n" +
                "Taxi Driver\n" +
                "Harry Potter and the Prisoner of Azkaban\n" +
                "Harry Potter and the Chamber of Secrets\n" +
                "The Sixth Sense\n" +
                "Scarface\n" +
                "Captain Phillips\n" +
                "American Beauty\n" +
                "The Incredibles\n" +
                "Donnie Darko\n" +
                "Predator\n" +
                "Nerve\n" +
                "The Man from U.N.C.L.E.\n" +
                "Full Metal Jacket\n" +
                "Heat\n" +
                "American History X\n" +
                "Gladiator\n" +
                "Reservoir Dogs\n" +
                "Snatch\n" +
                "A Clockwork Orange\n" +
                "Bridge of Spies\n" +
                "The Hangover\n" +
                "Sicario\n" +
                "2001: A Space Odyssey\n" +
                "Return of the Jedi\n" +
                "The Shining\n" +
                "The Conjuring\n");
    }


}
