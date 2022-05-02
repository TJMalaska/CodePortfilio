public int scoresAverage(int[] scores) {

        int firstAverage = average(scores,0, scores.length/2 );
        int secondAverage = average(scores,(scores.length/2) , scores.length );
        if(firstAverage > secondAverage){
        return firstAverage;
        }
        return secondAverage;
        }

public int average(int[] scores, int start, int end){
        int total = 0;
        for(int i = start; i < end; i++) {
        total += scores[i];
        }
        return total/ (end-start);
        }
