/* 1. Leap Year */

function leapYear(date){
     //var date = window.prompt("Input a Year : ");

     var x = (date % 100 === 0) ? (date & 400 === 0) : (date % 4 === 0);
     //console.log(x);
     return x;
   
}

/* 2. Email Validation */ 

function isEmail(string) {
    var regEx = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return regEx.test(string);
  }

/* 3. Remove Character */

function removeChar(string, position) {
    word = string.substring(0, position) + string.substring(position +1, string.length);

    return word;
}
        
/* 4. Remove "Script" */

function removeScript(string){
    let x = string.replace("Script", "");

    return x;
}

/* 5. Letter Shift */

function letterShift(string) {
    let aLetter = string.split('');
    let newLetter = "";

    for(i = 0; i < aLetter.length; i++){
        newLetter += String.fromCharCode(aLetter[i].charCodeAt()+1);
    }
    return newLetter;
}

/* 6. Vowel Count */

function vowelCount(string){

    return (string.match(/[aeiou]/ig)||[]).length;
}

/* 7. Reverse Array */

function reverseArr(array){
    let cart = ["Milk", "Bread", "Pizza", "Lettuce"];

    cart.reverse();
    return cart;
}

/* 8. Add Array */

function addArr(array1, array2){
    let arr = [];
    for(i=0;i<Math.max(array1.length, array2.length);i++){
        if(!array1[i]){
            array1[i] = 0;
        }

        if(!array2[2]){
            array2[i] = 0;
        }

        arr[i] = array1[i] + array2[i];
    }
    return arr;
}

/* 9. Longest String */

function longestStr(array){
    let str2 = "";
    let str = 0;
    for(i=0;i<array.length;i++){
        if(array[i].length > str2.length){
            str = i;
        }
    }
    return str;
}

/* 10. Area of a Triangle */

function area(number1, number2, number3){
    let ar = 0;

    if(number1 < (number2 + number3)){
        if(number2 < (number1 + number3)){
            if(number3 < (number1 + number2)){
                ar = ((1/2)*(number2*number3));
                return ar;
            }
        }
    }
    return undefined;
}

/* 11. Similar Polygons */

function areSimilar(array1, array2){

    array1.sort(function(a,b){return (a-b)});
    array2.sort(function(a,b){return (a-b)});

    if(array1.length != array2.length){
        return undefined;
    }
    
    let ratio = array1[0]/array2[0];
    for(i = 0; i < array1.length; i++){
        if(array1[i]/array2[i] != ratio){
            return false;
        }
    }
return true;
}

/* 12. Equivalent Arrays */

function equvArr(array1, array2){

    array1.sort(function(a,b){return (a-b)});
    array2.sort(function(a,b){return (a-b)});

    if(array1.length != array2.length){
        return false;
    }
    
    
    for(i = 0; i < array1.length; i++){
        if(array1[i] != array2[i]){
            return false;
        }
    }
return true;

}

/* 13. Tic Tac Toe */

function tictactoe(array){

    for(let i = 0; i < 3; i++) {
        if(array[0][0] == array[0][1] && array[0][1] == array[0][2]) {
            checkwin++;
            winner = array[i][0];
            if(winner == "X") {
                x = 1;
            }
            else if(winner == "O") {
                o = 1;
            }
        }

        if(array[0][0] == array[1][0] && array[1][0] == array[2][0]) {
            checkwin++;
            winner = array[i][0];
            if(winner == "X") {
                x = 1;
            }
            else if(winner == "O") {
                o = 1;
            }
        }

        if(array[2][0] == array[1][1] && array[1][1] == array[0][2]) {
            checkwin++;
            winner = array[i][0];
            if(winner == "X") {
                x = 1;
            }
            else if(winner == "O") {
                o = 1;
            }
        }

        if(array[2][2] == array[1][1] && array[1][1] == array[0][0]) {
            checkwin++;
            winner = array[i][0];
            if(winner == "X") {
                x = 1;
            }
            else if(winner == "O") {
                o = 1;
            }
        }
    }

    let xcount = 0;
    let ocount = 0;

        for(i=0;i<3;i++){
            for(j=0;j<i;j++){
                if(array[i][j]=="X"){
                    xcount++;
                } else if(array[i][j]=="O"){
                    ocount++;
                } else if(array[i][j]!=""){
                    return false
                }               
    
        }

    }
    
    if(xcount + ocount < 5){
        console.log("Game is not finished")
    }

    if(xcount > 5){
        return false;
    }

    if(ocount > 5){
        return false;
    }

    
}
