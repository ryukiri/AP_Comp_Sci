package funwithcalendars;

public class FunWithCalendars {
    private int month;
    private int day;
    private int year;
    
    public FunWithCalendars(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y-1592;
    }
    
    boolean isValid()
    {
        if(isLeapYear() == true){
            if(isValidMonth()==true && isValidDay()==true){
                return true;
            }else if(isValidMonth()==false || isValidDay()==false){
                return false;
            }
        }else if(isLeapYear() == false){
            if(isValidMonth()==true && isValidDay()==true){
                return true;
            }else if(isValidMonth()==false || isValidDay()==false){
                return false;
            }
        }
        return false;
    }
    
    boolean isLeapYear()
    {
        if((year%400==0) || (year%4==0 && year%100!=0)){
            return true;
        }else{
            return false;
        }
    }
    
    boolean isValidMonth(){
        if(month<13&&month>0){
            return true;
        }else{
            return false;
        }
    }
    
    boolean isValidDay(){
	if(month == 1){
		if(day <=31 && day >=1){
                    return true;
		}else{
                    return false;
                }
	}else if(month == 2){
            if(isLeapYear() == true){
                if(day<=29 && day>=1){
                        return true;
                    }else{
                    	return false;
                    }
            }else if(isLeapYear() == false){
                if(day<29&&day>=1){
                        return true;
                    }else{
                        return false;
                   }
              }
	}else if(month == 3){
            if(day<=31 && day>=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 4){
            if(day<=30 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 5){
            if(day<=31 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 6){
            if(day<=30 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 7){
            if(day<=31 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 8){
            if(day<=31 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 9){
            if(day<=30 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 10){
            if(day<=31 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 11){
            if(day<=30 && day >=1){
                return true;
            }else{
                    return false;
                }
        }else if(month == 12){
            if(day<=33 && day >=1){
                return true;
            }else{
                    return false;
                }
        }
        return false;
}

    
    String getDayOfWeek(){
        int total = getDinY()+ daytoMonth()+ day()+getLeap();
        int c = total % 7;
        if(c==0){
            return "Saturday";
        }else if(c==1){
            return "Sunday";
        }else if(c==2){
            return "Monday";
        }else if(c==3){
            return "Tuesday";
        }else if(c==4){
            return "Wednesday";
        }else if(c==5){
            return "Thursday";
        }else if(c==6){
            return "Friday";
        }
        return "errorDay";
    }
    
    int numDay(){
        if(isLeapYear()==true){
            if(month == 1){
                return 0;
            }else if(month == 2){
                return 31;
            }else if(month == 3){
                return 59;   
            }else if(month == 4){
                return 90;
            }else if(month == 5){
                return 120;
            }else if(month == 6){
                return 151;
            }else if(month == 7){
                return 181;
            }else if(month == 8){
                return 212;
            }else if(month == 9){
                return 243;
            }else if(month == 10){
                return 273;
            }else if(month == 11){
                return 304;
            }else if(month == 12){
                return 334;
            }
        }else if(isLeapYear()==false){
                    if(month == 1){
                return 0;
            }else if(month == 2){
                return 31;
            }else if(month == 3){
                return 60;   
            }else if(month == 4){
                return 91;
            }else if(month == 5){
                return 121;
            }else if(month == 6){
                return 152;
            }else if(month == 7){
                return 182;
            }else if(month == 8){
                return 213;
            }else if(month == 9){
                return 244;
            }else if(month == 10){
                return 274;
            }else if(month == 11){
                return 305;
            }else if(month == 12){
                return 335;
            }
        }
        return 0;
    }   //end of numDay
    
    int daytoMonth(){
        return numDay() + day;
    }   //end of leap
    
    int getLeap(){
        int j = (year/4) - (year/100) + (year/400);
        if(month<3)
            j--;
        return j;
        
    }
    
    int getDinY(){
        return year*365;
    }
    
    int day(){
        return day;
    }
    
}   //end of class
