package graph.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.math.BigDecimal;

public class Calculator implements ActionListener{

    JFrame frame;   //Creating an object of the JFrame class
    JTextField textField = new JTextField();

    //creating buttons for the digits
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");

    //creating buttons for the arithmetic operations

    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonRem = new JButton("%");

    JButton buttonOpBrk = new JButton("(");//button for open parenthesis
    JButton buttonEndBrk = new JButton(")");//button for closed parenthesis
    JButton buttonEqual = new JButton("=");//button for =


    //creating buttons for trigonometric functions
    JButton buttonSine = new JButton("Sin");
    JButton buttonCos = new JButton("Cos");
    JButton buttonTan = new JButton("Tan");
    JButton buttonAsine = new JButton("aSin");
    JButton buttonAcos = new JButton("aCos");
    JButton buttonAtan = new JButton("aTan");

    Calculator()// constructor
    {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI()    //prepare the GUI window
    {
        frame=new JFrame();
        frame.setTitle("Calculator");   // title of the JFrame
        frame.setSize(380,670); //Setting width=380 and height=670
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.getContentPane().setBackground(new Color(105,105,105));// Background Color
        frame.setResizable(false);//disable  window  resizing
        frame.setLocationRelativeTo(null);//Setting location to the center of the screen
        frame.setVisible(true);//enable the window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//default close operation


    }


    public void addComponents() {   //add components to the calculator


        textField.setBounds(10, 40, 345, 80);   //dist. from left edge-10 dist. from upper edge-40  width=345  height=80
        textField.setFont(new Font("Bierstadt", Font.BOLD, 20));//font-Bierstadt   font size-20
        textField.setBackground(new Color(245,245,245));
        textField.setBorder(BorderFactory.createEmptyBorder());
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);//the content is aligned to the right
        frame.add(textField);

        buttonOpBrk.setBounds(15, 170, 80, 60);
        buttonOpBrk.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonOpBrk.setBackground(new Color(255, 165, 0));
        buttonOpBrk.setBorderPainted(false);
        frame.add(buttonOpBrk);

        buttonEndBrk.setBounds(100, 170, 80, 60);
        buttonEndBrk.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonEndBrk.setBackground(new Color(255, 165, 0));
        buttonEndBrk.setBorderPainted(false);
        frame.add(buttonEndBrk);

        buttonClear.setBounds(185, 170, 80, 60);
        buttonClear.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonClear.setBackground(new Color(255, 99, 71));
        buttonClear.setBorderPainted(false);
        frame.add(buttonClear);

        buttonDelete.setBounds(270, 170, 80, 60);
        buttonDelete.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonDelete.setBackground(new Color(255, 99, 71));
        buttonDelete.setBorderPainted(false);
        frame.add(buttonDelete);

        buttonSine.setBounds(15, 235, 80, 60);
        buttonSine.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonSine.setBackground(new Color(0, 0, 139));
        buttonSine.setForeground(new Color(255, 255, 255));
        buttonSine.setBorderPainted(false);
        frame.add(buttonSine);

        buttonCos.setBounds(100, 235, 80, 60);
        buttonCos.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonCos.setBackground(new Color(0, 0, 139));
        buttonCos.setForeground(new Color(255, 255, 255));
        buttonCos.setBorderPainted(false);
        frame.add(buttonCos);

        buttonTan.setBounds(185, 235, 80, 60);
        buttonTan.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonTan.setBackground(new Color(0, 0, 139));
        buttonTan.setForeground(new Color(255, 255, 255));
        buttonTan.setBorderPainted(false);
        frame.add(buttonTan);


        buttonAsine.setBounds(15, 300, 80, 60);
        buttonAsine.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonAsine.setBackground(new Color(0, 0, 139));
        buttonAsine.setForeground(new Color(255, 255, 255));
        buttonAsine.setBorderPainted(false);
        frame.add(buttonAsine);

        buttonAcos.setBounds(100, 300, 80, 60);
        buttonAcos.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonAcos.setBackground(new Color(0, 0, 139));
        buttonAcos.setForeground(new Color(255, 255, 255));
        buttonAcos.setBorderPainted(false);
        frame.add(buttonAcos);

        buttonAtan.setBounds(185, 300, 80, 60);
        buttonAtan.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonAtan.setBackground(new Color(0, 0, 139));
        buttonAtan.setForeground(new Color(255, 255, 255));
        buttonAtan.setBorderPainted(false);
        frame.add(buttonAtan);

        buttonPlus.setBounds(270, 495, 80, 60);
        buttonPlus.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonPlus.setBackground(new Color(0, 0, 0));
        buttonPlus.setBorderPainted(false);
        buttonPlus.setForeground(new Color(255, 255, 255));
        frame.add(buttonPlus);


        buttonMinus.setBounds(270, 430, 80, 60);
        buttonMinus.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonMinus.setBackground(new Color(0, 0, 0));
        buttonMinus.setForeground(new Color(255, 255, 255));
        buttonMinus.setBorderPainted(false);
        frame.add(buttonMinus);


        buttonMul.setBounds(270, 365, 80, 60);
        buttonMul.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonMul.setBackground(new Color(0, 0, 0));
        buttonMul.setForeground(new Color(255, 255, 255));
        buttonMul.setBorderPainted(false);
        frame.add(buttonMul);


        buttonRem.setBounds(270, 235, 80, 60);
        buttonRem.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonRem.setBackground(new Color(0, 0, 0));
        buttonRem.setForeground(new Color(255, 255, 255));
        buttonRem.setBorderPainted(false);
        frame.add(buttonRem);


        buttonDiv.setBounds(270, 300, 80, 60);
        buttonDiv.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonDiv.setBackground(new Color(0, 0, 0));
        buttonDiv.setForeground(new Color(255, 255, 255));
        buttonDiv.setBorderPainted(false);
        frame.add(buttonDiv);


        buttonDot.setBounds(185, 560, 80, 60);
        buttonDot.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonDot.setBackground(new Color(0, 0, 0));
        buttonDot.setForeground(new Color(255, 255, 255));
        buttonDot.setBorderPainted(false);
        frame.add(buttonDot);


        buttonEqual.setBounds(270, 560, 80, 60);
        buttonEqual.setFont(new Font("Bierstadt", Font.PLAIN, 15));
        buttonEqual.setBackground(new Color(0, 0, 0));
        buttonEqual.setForeground(new Color(255, 255, 255));
        buttonEqual.setBorderPainted(false);
        frame.add(buttonEqual);


        buttonOne.setBounds(15, 495, 80, 60);
        buttonOne.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonOne.setBackground(new Color(212, 212, 212));
        buttonOne.setBorderPainted(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(100, 495, 80, 60);
        buttonTwo.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonTwo.setBackground(new Color(212, 212, 210));
        buttonTwo.setBorderPainted(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(185, 495, 80, 60);
        buttonThree.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonThree.setBackground(new Color(212, 212, 210));
        buttonThree.setBorderPainted(false);
        frame.add(buttonThree);

        buttonFour.setBounds(15, 430, 80, 60);
        buttonFour.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonFour.setBackground(new Color(212, 212, 210));
        buttonFour.setBorderPainted(false);
        frame.add(buttonFour);

        buttonFive.setBounds(100, 430, 80, 60);
        buttonFive.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonFive.setBackground(new Color(212, 212, 210));
        buttonFive.setBorderPainted(false);
        frame.add(buttonFive);

        buttonSix.setBounds(185, 430, 80, 60);
        buttonSix.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonSix.setBackground(new Color(212, 212, 210));
        buttonSix.setBorderPainted(false);
        frame.add(buttonSix);

        buttonSeven.setBounds(15, 365, 80, 60);
        buttonSeven.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonSeven.setBackground(new Color(212, 212, 210));
        buttonSeven.setBorderPainted(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(100, 365, 80, 60);
        buttonEight.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonEight.setBackground(new Color(212, 212, 210));
        buttonEight.setBorderPainted(false);
        frame.add(buttonEight);

        buttonNine.setBounds(185, 365, 80, 60);
        buttonNine.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonNine.setBackground(new Color(212, 212, 210));
        buttonNine.setBorderPainted(false);
        frame.add(buttonNine);

        buttonZero.setBounds(15, 560, 165, 60);
        buttonZero.setFont(new Font("Bierstadt", Font.BOLD, 15));
        buttonZero.setBackground(new Color(169, 169, 169));
        buttonZero.setBorderPainted(false);
        frame.add(buttonZero);


    }



    public void addActionEvent() {

        //Registering ActionListener to buttons
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonRem.addActionListener(this);
        buttonOpBrk.addActionListener(this);
        buttonEndBrk.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonSine.addActionListener(this);
        buttonCos.addActionListener(this);
        buttonTan.addActionListener(this);
        buttonAsine.addActionListener(this);
        buttonAcos.addActionListener(this);
        buttonAtan.addActionListener(this);


    }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {    //to set the functionality when a button is pressed
        Object source = e.getSource();


         if (source == buttonClear) {   //clear button is pressed

            textField.setText("");  //clear the text
        } else if (source == buttonDelete) {    //delete button is pressed

            int length = textField.getText().length();
            String s=textField.getText();
            int number = length - 1;
            char check=s.charAt(number);

            if(length>=4 && (check=='n'||check=='s') && s.charAt(number-3)=='a'){ //delete atan,acos and asine

                 StringBuilder backspace = new StringBuilder(textField.getText());//use mutable character sequence
                 for(int d=0;d<4;d++)
                    backspace.deleteCharAt(number-d);//delete the last element

                 textField.setText(backspace.toString());

             }

             else if(length>=3 && (check=='n'||check=='s') && (s.charAt(number-2)=='s'||s.charAt(number-2)=='t'||s.charAt(number-2)=='c')){
                 //delete sine,cos,tan
                 StringBuilder backspace = new StringBuilder(textField.getText());//use mutable character sequence
                 for(int d=0;d<3;d++)
                     backspace.deleteCharAt(number-d);//delete the last element

                 textField.setText(backspace.toString());

             }


            else if (number > 0) {   //if (length > 0)
                StringBuilder backspace = new StringBuilder(textField.getText());//use mutable character sequence
                backspace.deleteCharAt(number);//delete the last element
                textField.setText(backspace.toString());

            }
            else { //if (textField.getText().endsWith(""))

                textField.setText("");//clear if there is only 1 element
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {  //doesnt alllow 2 zeros at the begining of the number
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {    //doesnt allow 2 decimal dots at the beginning
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == buttonPlus) {

             textField.setText(textField.getText() + "+");


        } else if (source == buttonMinus) {

             textField.setText(textField.getText() + "-");

        } else if (source == buttonMul) {

             textField.setText(textField.getText() + "*");
        } else if (source == buttonDiv) {

             textField.setText(textField.getText() + "/");

        } else if (source == buttonRem) {

             textField.setText(textField.getText() + "%");


        } else if (source == buttonOpBrk) {

             textField.setText(textField.getText() + "(");

        } else if (source == buttonEndBrk) {

             textField.setText(textField.getText() + ")");

        } else if(source == buttonSine){
             textField.setText(textField.getText() + "sin(");
         }else if(source == buttonCos){
             textField.setText(textField.getText() + "cos(");
         }else if (source == buttonTan) {

             textField.setText(textField.getText() + "tan(");

         } else if (source == buttonAsine) {

             textField.setText(textField.getText() + "asin(");

         } else if(source == buttonAcos){
             textField.setText(textField.getText() + "acos(");
         }else if(source == buttonAtan){
             textField.setText(textField.getText() + "atan(");
         }else if (source == buttonEqual) {
            //Setting functionality for equal(=) button



             try {
                 String str = textField.getText();
                 if(validate(str+"=")){

                     String ans = solveTrig(str);
                     textField.setText(textField.getText()+"=" +ans);
                 }
                 else{
                     textField.setText(" Math error! ");
                     //textField.setText(textField.getText() +" Math error");
                 }

             } catch (Exception exception) {
                 textField.setText("Error");
             }




         }


    }
    public static double precedence(char op) {  // Function to find precedence of operators
        if (op == '+' || op == '-')
            return 1;
        if (op == '*' || op == '/' || op == '%')
            return 2;
        return 0;
    }

    public static double applyOperator (double a, double b, char op) throws Exception {   //function to perform the arithmetic operations
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            default:
                throw new Exception("Error in input!");
        }

    }

    public static double evaluate(String exp) throws Exception {


        char[] token = convert(exp);    //pass the expression to the convert function
        int i;

        Stack<Double> values = new Stack<>();// stack to store the double values.
        Stack<Character> ops = new Stack<>();// stack to store operators.

        ops.push('(');
        for (i = 0; i < token.length; i++) {


            if (token[i] == ' ')    //skip whitespaces
                continue;


            else if (token[i] == '(') { //push '(' to the operator stack
                ops.push(token[i]);
            }

            // Current token is a number, push
            // it to stack for numbers.
            else if (Character.isDigit(token[i])) { //if token is a digit
                StringBuilder val = new StringBuilder();

                //check if the number has more than 1 digit or a decimal point
                while (i < token.length && (Character.isDigit(token[i]) || token[i] == '.')) {
                    if (Character.isDigit(token[i]))
                        val.append((token[i] - '0'));
                    else
                        val.append(".");

                    i++;// i points to the next character now .as the for loop also increments i we should correct the offset.
                }

                values.push(Double.parseDouble(val.toString()));

                i--;
            }

            // if token is ')',solve the entire bracket.
            else if (token[i] == ')') {
                while (!ops.empty() && ops.peek() != '(') {
                    double v2 = values.peek();
                    values.pop();

                    double v1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOperator(v1, v2, op));//push the calculated value to the stack
                }


                if (!ops.empty())
                    ops.pop();  // pop the opening parenthesis.
            }

            // Current token is an operator.
            else {


                //if precedence of the top of ops>=precendence of current operator,apply current operator on the 2 top elements of val stack

                while (!ops.empty() && precedence(ops.peek())
                        >= precedence(token[i])) {
                    double val2 = values.peek();
                    values.pop();

                    double val1 = values.peek();
                    values.pop();

                    char op = ops.peek();
                    ops.pop();

                    values.push(applyOperator(val1, val2, op));
                }

                // Push current token to 'ops' stack.
                ops.push(token[i]);
            }
        }

        // Entire expression has been passed now.Apply remaining ops to remaining values.
        while (ops.size()>1) {
            double val2 = values.peek();
            values.pop();

            double val1 = values.peek();
            values.pop();

            char op = ops.peek();
            ops.pop();

            values.push(applyOperator(val1, val2, op));
        }


        if(values.size()!=1)
            throw new Exception("Error in input!");//if the remaining number of elements in the stack !=1 ->error

        return values.peek(); // Top of 'values' contains result, return it.
    }

    public boolean isOperator(char op){
        if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
            return true;
        }
        return false;
    }


    public boolean  validate(String s){

        char begChar=s.charAt(0);
        char endChar=s.charAt(s.length()-2);
        if(isOperator(begChar)&&(begChar!='+')&&(begChar!='-')){   //cannot have /,*,% at the beginning

            return false;
        }
        if(isOperator(endChar)||endChar=='.'){   //cannot have /,* at the end

            return false;
        }

        for(int i=0;i<s.length();i++){

            char temp=s.charAt(i);

            if(i<=s.length()-2 ){

                if(isOperator(temp)&&(temp!='+')&&(temp!='-')&&temp==s.charAt(i+1)){
                    return false;   //cannot have **,// or %%
                }

                if(isOperator(temp)&&isOperator((s.charAt(i+1)))){
                    if(!((temp=='+' && s.charAt(i+1)=='-' )||(temp=='-'&& s.charAt(i+1)=='+') )) //can only have +- and -+.cant have /*,*/,%* etc
                        return false;
                }


            }
            if(i<=s.length()-3 ){

                if(isOperator(temp)&&temp==s.charAt(i+1)&&temp==s.charAt(i+2)){
                    return false;   //cannot have +++,---,***,/// or %%%
                }

            }
        }

        return true;
    }

    public static String solveTrig(String s) throws Exception {  //function to solve the trig values
        char[] str = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        int n = s.length();
        String tFunc = "";  //string for the trigonometric function
        String trigVal = "";//string for the extracted value
        boolean flag = true;    //flag to check if there are any trig expressions left

        int index = -1, strt = -1;  //2 variables used too extract the postition of the brackets
        for (int i = 0; i < n; i++) {
            if(i!=0 && Character.isAlphabetic(str[i])){
                if(Character.isDigit(str[i-1])){
                    throw new Exception("Error!"); //if there is a digit immediately before a trig function,doesnt evaluate
                                                        //ex:345cos(76)-->exception
                }
            }
             if(str[i]=='a' && str[i+1] == 'n'){ //check the 2nd and the third letter for tan
                tFunc = "tan";
                strt = i + 2;   //position of the opening bracket after tan
                index = i + 2;
                flag = false;   //trig expression found
            }else if(str[i] == 'a'){    //for inverse functions
                if(str[i+1]=='s'){  //check the 2nd letter for asin
                    tFunc = "asin";
                }else if(str[i+1] == 'c'){ //check the 2nd letter for acos
                    tFunc = "acos";
                }else{
                    tFunc = "atan"; //check the 2nd letter for atan
                }

                index = i + 4;
                strt = i + 4;
                flag = false;
            } else if(str[i]=='i' && str[i+1] == 'n'){
                tFunc = "sin";
                index = i + 2;
                strt = i + 2;
                flag = false;
            } else if(str[i]=='o' && str[i+1] == 's'){
                tFunc = "cos";
                index = i + 2;
                strt = i + 2;
                flag = false;
            }


            if(!flag){  //use stack to evaluate nested trig expressions
                stack.push(str[index]);
                while (!stack.empty()) {
                    index++;
                    if (str[index] == ')') stack.pop();
                    if (str[index] == '(') stack.push('(');
                }

                trigVal = s.substring(strt + 1, index);
                s = s.replace(tFunc + "(" + trigVal + ")", tFunc + "()");
                break;
            }
        }

        if (flag) { //flag is true if there are no trig expressions present.If so,send to evaluate the numerical expression
            return Double.toString(evaluate(s));
        } else {
            double t = Double.parseDouble(solveTrig(trigVal));
            double value = 0;
            switch (tFunc) {
                case "sin":
                    value = Math.sin(Math.toRadians(t));//convert to rad,find the value of the trig function and convert to degrees again
                    break;
                case "cos":
                    value = Math.cos(Math.toRadians(t));//find cos value
                    break;
                case "tan":
                    value = Math.tan(Math.toRadians(t));//find tan value
                    break;
                case "asin":
                    value = Math.toDegrees(Math.asin(t));//find sin inverse value
                    break;
                case "acos":
                    value = Math.toDegrees(Math.acos(t));//find cos inverse value
                    break;
                case "atan":
                    value = Math.toDegrees(Math.atan(t));//find tan inverse value
                    break;



            }

            String strv = new BigDecimal(value).toPlainString();
            s = s.replace(tFunc+"()", strv);

        }

        s = s.replace("+-", "-");
        return solveTrig(s);

    }

    public static  char[] convert(String expression){

            //function to replace double operators and get to the proper format to be evaluated.
            //ex:54+-43==54-43



        expression = expression.replace("++","+");  // ++ ->+
        expression = expression.replace("--","+");  // -- ->+
        expression = expression.replace("+-","-");  // +- ->-
        expression = expression.replace("-+","-");  // -+ ->-


        int end=-1;
        StringBuilder sb = new StringBuilder(expression);
        if(expression.charAt(0)=='+'){  //if the expression starts with +,ignore it
            sb.deleteCharAt(0);
        }else if(expression.charAt(0)=='-'){ //if the expression starts with -

            //if the expression starts with -, replace it to avoid confusing it as a  operator
            //ex: -1.25 -> (0-1.25)

            for(int i=1;i<expression.length();i++){
                if(!Character.isDigit(expression.charAt(i))&& expression.charAt(i) != 'c' && expression.charAt(i) != 'o' && expression.charAt(i) != 's' && expression.charAt(i) != 'i' && expression.charAt(i) != 'n' && expression.charAt(i) != 'a' && expression.charAt(i) != 't'
                ){
                    if(expression.charAt(i)!= '.'){
                        end = i;
                        break;
                    }
                }
                if (i == expression.length() - 1) end = expression.length();
            }
            sb.insert(end,')');
            sb.insert(0,'(');
            sb.insert(1,'0');

        }
        boolean flag = true;
        while(flag && sb.length() > 1){
            for(int i=1;i<sb.length();i++){
                if(sb.charAt(i)=='-' && !Character.isDigit(sb.charAt(i-1)) && sb.charAt(i-1) != ')' ){
                    sb.insert(i,'(');
                    sb.insert(i+1,'0');

                    for(int j=i+3;j<sb.length();j++){
                        if(!Character.isDigit(sb.charAt(j)) || j == sb.length()-1){
                            if(sb.charAt(j)!= '.'){
                                end = j;
                                if(j==sb.length()-1)
                                    end++;
                                break;
                            }
                        }

                    }
                    sb.insert(end,')');
                    break;
                }
                if(i==sb.length()-1){
                    flag = false;
                }
            }
        }


        return sb.toString().toCharArray();

    }






}