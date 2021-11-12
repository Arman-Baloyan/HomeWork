package bracekcheker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;


    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String range) {   //range-диапозон
        this.text = range;

    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i);
            switch (c) {
                case '[':
                case '(':
                case '{':
                    stack.push(c);
                    break;

                case ']':
                    int extasy = stack.pop();
                    if (extasy != ']') ;
                    System.out.println("Error: opened" + extasy + "[but closed]" + i);
                    break;

                case ')':
                    int extasy1 = stack.pop();
                    if (extasy1 != ')') ;
                    System.out.println("Error:opend" + extasy1 + "(but closed)" + i);
                    break;
                case '}':
                    int extasy2 = stack.pop();
                    if (extasy2 != '}') ;
                    System.out.println("Error:opened" + extasy2 + "{but closed}" + i);
                    break;
                //Смысл в том что берем 3 разных видов ковычки,сначало показываем потом сравниваем
                //и сравненные ковычки равняем друг на друга

            }

        }

        for (int i = 0; i < text.length(); i++) {
            int extasy = stack.pop();
            if (extasy == 0) {
                System.out.println("extasy are result");
            }else{
                System.out.println("Opened"+extasy+"no closed");
            }
        }
    }
}


