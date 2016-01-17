# Myanmar Sorting Sample

<p>Sample for how to sort Burmese words in a list using ICU library.</p>

<p>This snap code show how to use <a href="http://site.icu-project.org/">ICU4J</a> for Myanmar Locale.
This code use icu4j.jar lib file.<br>
*__java.text.Collator__* does not work correctly with Myanmar Sorting. Instead of using this Java default Collator, we use *__com.ibm.icu.text.Collator__* from ```icu4j.jar``` in this code sample.
<pre>
Input String 1 = "ကမ်", "မှ", "မြန်", "အု", "မေ", "အဲ", "သန်တ", "သန်း", "သန္တ", "ကံ", "အူ", "ဥ"
Output Sorted String 1 = ကံ , ကမ် , မေ , မြန် , မှ , သန္တ , သန်တ , သန်း , အု , ဥ , အူ , အဲ 

Input String 2 = "အာ","အို", "ဣ", "အီ", "အီ့", "အီး", "အီ့း", "အား", "အာ့", "အိ", "အာ့", "အ", "ဤ","ယောက်ျား", "ယောက်ချို","ယောက်က","ပြဿနာ","ပြသ်ဝ","ပြသ်သနာ"
Outpu Sorted String 2 = ပြသ်ဝ , ပြဿနာ , ပြသ်သနာ , ယောက်က , ယောက်ျား , ယောက်ချို , အ , အာ , အာ့ , အာ့ , အား , အိ , ဣ , အီ , ဤ , အီ့ , အီး , အီ့း , အို
</pre>
Have a happy codding! :+1: :100: