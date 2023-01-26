package String.StringBuilder.Tasks;

/**
 *  Оптимизируйте программу по подсчету количества вхождений строки в текст
 */
public class FindRepeats {

    int numberOfRepeats(String text, String substring) {
       StringBuilder stringBuilder = new StringBuilder(text);
       int count =0;
        int index = stringBuilder.indexOf(substring);
       while(stringBuilder.indexOf(substring)!=-1){
          if(index!=-1){
              count++;
              stringBuilder.delete(index,index+substring.length());
          }
       }
return count;
    }

}
