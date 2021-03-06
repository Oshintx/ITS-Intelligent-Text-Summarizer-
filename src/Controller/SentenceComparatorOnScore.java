/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Oshin
 */
import Models.Sentence;
import java.util.Comparator;

public class SentenceComparatorOnScore  implements Comparator<Sentence>{
    /**
     * SentenceComparatorOnScore used to compare two sentence base on its score
     * @param obj1
     * @param obj2
     * @return 
     */
	@Override
	public int compare(Sentence obj1, Sentence obj2) {
		if(obj1.getScore() > obj2.getScore()){
			return -1;
		}else if(obj1.getScore() < obj2.getScore()){
			return 1;
		}else{
			return 0;
		}
	}
}