public class Add {

    public void add(int... numbers){
        int sum = 0;
        String sumExp = "";

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            sumExp += numbers[i];

            if(i < numbers.length - 1){
                sumExp += "+";
            }
        }

        sumExp += "=" + sum;
        System.out.println(sumExp);
    }
}
