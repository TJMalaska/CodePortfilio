public boolean dividesSelf(int n) {
        int num = n;
        while(num > 1){
        if (num%10 == 0||(n%(num%10))!= 0 ){
        return false;
        }

        num = num/10;
        }
        return true;
        }
