package de.klosebrothers.apprentice.kata.tennis;

import org.junit.jupiter.api.Test;

import static de.klosebrothers.apprentice.kata.tennis.Tennis.parseScore;
import static org.assertj.core.api.Assertions.assertThat;

class TennisTest {

    @Test
    void scoreIs0To0() {
        assertThat(parseScore(0,0)).isEqualTo("Love all");
    }

    @Test
    void scoreIs1To1() {
        assertThat(parseScore(1, 1)).isEqualTo("Fifteen all");
    }

    @Test
    void scoreIs2To2() {
        assertThat(parseScore(2, 2)).isEqualTo("Thirty all");
    }

    @Test
    void scoreIs3T3() {
        assertThat(parseScore(3, 3)).isEqualTo("Deuce");
    }

    @Test
    void scoreIs0To1() {
        assertThat(parseScore(0, 1)).isEqualTo("Love, Fifteen");
    }

    @Test
    void scoreIs0To2() {
        assertThat(parseScore(0, 2)).isEqualTo("Love, Thirty");
    }

    @Test
    void scoreIs1To2() {
        assertThat(parseScore(1, 2)).isEqualTo("Fifteen, Thirty");
    }

    @Test
    void scoreIs3To2() {
        assertThat(parseScore(3, 2)).isEqualTo("Forty, Thirty");
    }

    @Test
    void scoreIs4To0() {
        assertThat(parseScore(4, 0)).isEqualTo("Player One wins");
    }

    @Test
    void scoreIs0To4() {
        assertThat(parseScore(0, 4)).isEqualTo("Player Two wins");
    }

    @Test
    void scoreIs4To5() {
        assertThat(parseScore(4, 5)).isEqualTo("Advantage Player One");
    }

}
