class Solution {
    public String reformatDate(String date) {
        String[] arr = date.split(" ");
        String day = arr[0].replaceAll("[A-Za-z]","");
        String month = check(arr[1]);
        String year = arr[2];
        if(day.length() == 1){
            day = "0" + day;
        }
        return year + "-" + month + "-" + day;
    }
    public String check(String month){
        switch(month){
            case "Jan": return "01";
            case "Feb": return "02";
            case "Mar": return "03";
            case "Apr": return "04";
            case "May": return "05";
            case "Jun": return "06";
            case "Jul": return "07";
            case "Aug": return "08";
            case "Sep": return "09";
            case "Oct": return "10";
            case "Nov": return "11";
            case "Dec": return "12";
            default: return "";
        }
    }
}