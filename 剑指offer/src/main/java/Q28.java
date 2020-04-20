//public class Q28 {
//    public boolean lemonadeChange(int[] bills) {
//        if(bills==null||bills.length<1){
//            return false;
//        }
//        if(bills[0]>5){
//            return false;
//        }
//        int five=0;
//        int ten=0;
//        for (int i=0;i<bills.length;i++){
//            if(bills[i]==5){
//                five++;
//            }
//            else if(bills[i]==10){
//                if(five<1){
//                    return false;
//                }
//                five--;
//                ten++;
//            }
//            else(bills[i]==20){
//                if(five>0&&ten>0){
//                    five--;
//                    ten--;
//                }
//                else if(ten<1&&five>2){
//                    five=five-3;
//                }
//                else{
//                    return false;
//                }
//
//
//            }
//        }
//        return true;
//
//    }
//}
