package Comparator;
/*
     Author:Mason
     2017/11/13 23:47
*/

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if(a.score == b.score){
            return a.name.compareTo(b.name);
        }
        else {
            return a.score > b.score ? -1 : 1;
        }

    }
}
