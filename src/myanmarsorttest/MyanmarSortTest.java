/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myanmarsorttest;

import com.ibm.icu.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author san
 */
public class MyanmarSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //List<String> words = Arrays.asList("အို", "အ", "အေ", "အု", "အော်", "အော", "အံ");
        //List<String> words = Arrays.asList("အာ","အို", "ဣ", "အီ", "အီ့", "အီး", "အီ့း", "အား", "အာ့", "အိ", "အာ့", "အ", "ဤ","ယောက်ျား", "ယောက်ချို","ယောက်က","ပြဿနာ","ပြသ်ဝ","ပြသ်သနာ");
        List<String> words = Arrays.asList("ကမ်", "မှ", "မြန်", "အု", "မေ", "အဲ", "သန်တ", "သန်း", "သန္တ", "ကံ", "အူ", "ဥ");
        Locale my_MM = new Locale("my", "MM", "");
        Collator coll = Collator.getInstance(my_MM);
        Collections.sort(words, coll);
        for (String word : words) {
            System.out.print(word + " , ");
            // correct output should be ပြသ်ဝ , ပြဿနာ , ပြသ်သနာ , ယောက်က , ယောက်ျား , ယောက်ချို , အ , အာ , အာ့ , အာ့ , အား , အိ , ဣ , အီ , ဤ , အီ့ , အီး , အီ့း , အို
            // correct output should be ကံ , ကမ် , မေ , မြန် , မှ , သန္တ , သန်တ , သန်း , အု , ဥ , အူ , အဲ 
        }

    }

}
