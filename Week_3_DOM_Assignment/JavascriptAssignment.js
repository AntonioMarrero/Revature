/************************************************************/
/* Author: Antonio Marrero Bonilla                          */
/* Company: Revature                                        */
/* Subject: Week 3 Manipulate the DOM Assignemnt using      */
/*          JavaScript.                                     */
/************************************************************/


/***********************************************************/
/*                   Question 1                            */
/***********************************************************/

let google = document.getElementsByName("google")[0];
google.setAttribute("target", "_blank");
google.href = "https://www.google.com";

//----------------------------------------------------//

let twitter = document.getElementsByName("twitter")[0];
twitter.setAttribute("target", "_blank");
twitter.href = "https://www.twitter.com";

//---------------------------------------------------//

let slack = document.getElementsByName("slack")[0];
slack.setAttribute("target", "_blank");
slack.href = "https://www.slack.com";

//---------------------------------------------------//

let javadocs = document.getElementsByName("javadocs")[0];
javadocs.setAttribute("target", "_blank");
javadocs.href = "https://www.javadocs.com";

/***********************************************************/
/*                   Question 2                            */
/***********************************************************/

// This removes the pluto option all together from the options.
let dis = document.getElementById("planet");
dis.remove(3);

// This disables the pluto option.
// let dis = document.getElementById("planet").options[3];
// dis.disable = 3;

/***********************************************************/
/*                   Question 3                            */
/***********************************************************/
dis.onchange = function alientText(){

    if(dis.value != "Earth"){
        let hid = document.querySelectorAll("p[hidden]");

        for(i=0;i<hid.length;i++){
            hid[i].removeAttribute("hidden");
        }
    }
}

/***********************************************************/
/*                   Question 4                            */
/***********************************************************/

let submit = document.getElementById("form-sub");

document.getElementById("form-sub").onclick = function submittion(){
    
// ************* ASSIGN VARIABLES AND GET ELEMENTS ****************** //
    // get the input values
    let fname = document.getElementById("firstname").value;
    let lname = document.getElementById("lastname").value;
    let email = document.getElementById("email").value;
    let cel = document.getElementById("phone").value;
    let bday = document.getElementById("bday").value;
    let gen = document.getElementsByName("gender");
    let col = document.getElementById("color").value;
    let act = document.getElementsByClassName("activity");

    // Assign the gender radio buttons to an empty string.
    let gend = "";

    // Assign the acitivities check boxes to an empty string.
    let chek = "";

    // combined the first name and last name
    let name = fname + " " + lname;

// ************* VALIDATION ****************** //

    // Iput validation for the first and last name.
    let str1 = fname.length;
    let str2 = lname.length;
    
    if(fname == ""){
        
        alert("Please enter a First name");
        return false;
        submittion();
    }

    if(lname == ""){
        
        alert("Please enter a Last name");
        return false;
        submittion();
    } 

    if(str1 < 2){
        alert("First Name must be more than one letter long");
        return false;
        submittion();
    }

    if(str2 < 2){
        alert("Last Name must be more than one letter long");
        return false;
        submittion();
    }

    // Input validation for email address    
    let filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

    if(!filter.test(email)){
        alert("please enter a valid email");
        email.focus;
        return false;
    }

    // Input validation for a phone number.
    let celStr = cel.length;
    let celMatch = /^[0-9]+$/;
    if(cel.length != 10){
        alert("Must enter a 10 digit phone number");
        return false;
        submittion();
    }

    let celFilter = /^[0-9]+$/;
    if(!celFilter.test(cel)){
        alert("Invalid phone numbers. Only 0 - 9 are allow.");
        cel.focus;
        return false;
    }

    // Check Date if is empty 
    if(bday == ""){
        alert("Must enter a Date");
        bday.focus;
        return false;
    }    

// ***************** GET VALUES ******************* //

    // get the value from the radio buttons
    for(i = 0; i < gen.length;i++){
        if(gen[i].checked){
            gend = gen[i].value;          
        }
    }    

    // Check if Gender Radio Buttons is not selected 
    if(gend == ""){
        alert("must make a selection");
        gen.focus;
        return false;
    }
    // get the value from the checkboxes
    for(i = 0; i < act.length;i++){
        if(act[i].checked){
            chek = act[i].value;
            // chek.add[i].value;
        }
    }

    // Check if an Activity has being checked.
    if(chek == ""){
        alert("Must Make a choice of activities or activity");
        act.focus;
        return false;
    }
   

    // gets the table
    let table = document.getElementsByClassName("table")[0];

    // ********** INSERT ROWS AND CELLS INTO TABLE ************** //
 
    // insert a row at the bottom of the table
    let add = table.insertRow(table.rows.length);
    // set the attributes for the row
    add.setAttribute("scope", "row");

    // insert the cells with the content
    add.insertCell(0).innerText = name;
    add.insertCell(1).innerText = email;
    add.insertCell(2).innerText = cel;
    add.insertCell(3).innerText = bday;
    add.insertCell(4).innerText = col;
    add.insertCell(5).innerText = gend;
    add.insertCell(6).innerText = chek;
    
    return false;    
}

/***********************************************************/
/*                   Question 5                            */
/***********************************************************/
let det = document.getElementsByTagName("details")[0];

det.onmouseover = function openDetails(){

    det.setAttribute("open", true);
}

det.onmouseout = function closeDetails(){
    det.removeAttribute("open");
}


/***********************************************************/
/*                   Question 6                            */
/***********************************************************/
function spanConcat(){
    let concat = "";

    let myarr = document.getElementsByTagName("span");

    for(i=0; i<myarr.length;i++){
        concat += myarr[i].innerText;
    
    }

    console.log(concat);
    return concat;
}



/***********************************************************/
/*                   Question 7                            */
/***********************************************************/
let earthT = document.getElementById("earth_time_check");

earthT.onclick = function earthTime(){
    time = new Date().toLocaleTimeString();
    alert("Earth Time is: " + time);
}


/***********************************************************/
/*                   Question 8                            */
/***********************************************************/
document.getElementById("acb_time_check").onclick =  function loadDoc(){ 

    // creates new XMLHttp request object.
    let xhr = new XMLHttpRequest();

    xhr.onreadystatechange = function(){

   if(this.readyState == 4 && this.status ==200){

        // prints the response status text to console
        console.log(xhr.responseText);
    
        // Turning response into a json
        let jsn = JSON.parse(xhr.responseText);
        alert(jsn);
        let period = jsn.exoplanets[0].per;

        let acbTime = new Date;
        let acbDays = period;
        let acbRoot = ((acbTime.getFullYear() - 1970)*(365/acbDays));
        let acbYears = parseInt(acbRoot);
        let acbMonth = parseInt((acbRoot-acbYears)*12);
        acbTime.setYear(acbYears-1970);
        acbTime.setMonth(acbMonth);
        alert(acbYears +" are the revolutions since January 1st, 1970.");

   }

}

xhr.open("GET","http://www.astropical.space/astrodb/api-exo.php?which=name&limit=Proxima%20Cen%20b&format=json");
xhr.send();

   }

 function altMode(){

        fetch("http://www.astropical.space/astrodb/api-exo.php?which=name&limit=Proxima%20Cen%20b&format=json")
            .then(function(response){

                return response.json();

            }).then(function(myJson){

                let jsn = myJson;
                
                // semi major axis which is 0.04
                let period = jsn.exoplanets[0].per;        

        // just to test if got the right value.
        alert(period);

        let acbTime = new Date;
        let acbDays = period;
        let acbRoot = ((acbTime.getFullYear() - 1970)*(365/acbDays));
        let acbYears = parseInt(acbRoot);
        let acbMonth = parseInt((acbRoot-acbYears)*12);
        acbTime.setYear(acbYears-1970);
        acbTime.setMonth(acbMonth);
        alert(acbYears +" are the revolutions since January 1st, 1970.");

          })
   }

/***********************************************************/
/*                   Question 9                            */
/***********************************************************/
var bg = document.getElementsByTagName("h1")[0];

// change colors giving an array of pre set colors.
// bg.onclick = function backgroundChange(){
//     var colors = ["pink", "green", "blue", "brown", "grey"];
//     var i = 0;
//     function change() {
//         bg.style.backgroundColor = colors[i];
//         i++;
        
//         if(i > colors.length - 1) {
//             i = 0;
//         }
//     }

//     setInterval(change, 3000);
// }

// change colors using rbg randomizer
// the +3 will avoid the random color to be 0,0,0 which is the rgb for black color.
bg.onclick = function changeColors(){
    
    function change(){
        let colors = 'rgb(' + (Math.floor(Math.random() * 256)+3) + ',' + (Math.floor(Math.random() * 256)+3) + ',' + (Math.floor(Math.random() * 256)+3) + ')';
        bg.style.backgroundColor = colors;
    }
    // set the interval for 3 seconds
    setInterval(change, 3000);
}

/***********************************************************/
/*                   Question 10                           */
/***********************************************************/
let num1 = document.getElementById("n1");
let num2 = document.getElementById("n2");
let ops = document.getElementById("operation");

ops.onchange = function calculate(){
    num1.value;
    num2.value;
    let sum = 0;
    let minus = 0;
    let mult = 0;
    let divi = 0;

        if(operation.value == "Add"){
            sum = parseInt(num1.value) + parseInt(num2.value);
            if(add == NaN){
                alert("Pleae enter numbers to be added")
            } else{
                alert(sum);
            }
        }

        if(operation.value == "Subtract"){
            minus = num1.value - num2.value;
            if(sub == NaN){
                alert("Must enter numbers to be subtracted")
            } else{
                alert(minus);
            }
        }

        if(operation.value == "Multiply"){
            mult = num1.value * num2.value;
            if(mult == NaN){
                alert("Please enter numbers to be multiplied")
            } else{
                alert(mult);
            }
        }

        if(operation.value == "Divide"){
            divi = num1.value / num2.value;
            if(divi == NaN){
                alert("Please enter numbers to be divided")
            } else{
                alert(divi);
            }
        }
}



/***********************************************************/
/*                   Question 11                           */
/***********************************************************/
// function walkTheDom(node){

//     console.log(node);

//     for(node=node.firstChild; node!==null; node=node.nextSibling) {

//     walkTheDom(node);

//     }
// }
