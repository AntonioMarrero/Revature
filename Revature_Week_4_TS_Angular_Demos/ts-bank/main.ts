import { Account } from './account';
import { User } from './user';

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let users = [
    new User("Veronica", "demDigits"),
    new User("Matthew", "password"),
    new User("Bill", "q1234")
];

users[0]._accounts = [
    new Account(500, "checking"),
    new Account(250, "savings")
]

users[1]._accounts = [
    new Account(1500, "checking"),
    new Account(5250, "savings")
]

users[2]._accounts = [
    new Account(2500, "checking"),
    new Account(3250, "savings")
]

let username: string;
let password: string;

let loggedUser: User;
let account: Account;

// --------------------------------------

// Application

getUsername();

//---------------------------------------

// Functions

function getUsername(){
    rl.question("\nWelcome to MuhBank-TS!\n\nInput your username('q' to quit):", (answer: string) => {
        if(answer === 'q'){
            rl.close();
        } else {
            username = answer;
            getPassword();
        }
    });
}

function getPassword(){
    rl.question("Input your passworkd: ", (answer: string) => {
        password = answer;
        login();
    });
}

function login() {
    loggedUser = users.filter((user: User) => user.login(username, password))[0];
    if(loggedUser){
        console.log(`Successfully logged in user: ${loggedUser.username} \n`);
        userAccountsMenu();
    } else {
        getUsername();
    }
}

function userAccountsMenu(){
    rl.question("\nUser Accounts Menu\n[1] - Checking\n[2] - Savings\n[3] - Exit\nSelection: ", (answer: string) => {
        if(answer == "1") {
            account = loggedUser._accounts.filter((account) => account.type == "checking")[0]; 
            console.log("Navigation to Account Action Menu...");
            accountActionsMenu();
        } else if(answer == "2"){
            account = loggedUser._accounts.filter((account) => account.type == "savings")[0];
            console.log("Navigating to Accnount Actions Menu ...");
            accountActionsMenu();
        } else if(answer == "3"){
            console.clear();
            console.log(`\nUser, ${loggedUser.username}, has been logged out`);
            loggedUser.username = '';
            loggedUser.password = '';
            getUsername();
        } else {
            console.log("Invalid input, please try again...");
            userAccountsMenu();
        }
    });
}

function accountActionsMenu(){
    rl.question(`\nAccount Actions Menu\n[1] - Deposit\n[2] - Withdraw\n[3] - View Balance\n[4] - Previous Menu\n Selection:  `, (answer: string) => {
        if(answer == "1"){
            depositMenu();
        } else if(answer == "2"){
            withdrawMenu();
        } else if(answer == "3"){
            console.log(`Current balance of ${account.type}: ${account.balance}`);
            accountActionsMenu();
        } else if(answer == "4"){
            userAccountsMenu();
        } else {
            console.log("Invalid input, please try again")
            accountActionsMenu();
        }
    });
}

function depositMenu() {
    rl.question("\nPlease enter the amount you like to deposit (x to return to previous menu): ", (answer: string) => {
        if(answer == "x"){
            console.log("Returning to Account Actions Menu....");
            accountActionsMenu();
        }

        if((typeof(parseFloat(answer)) != "number") || parseFloat(answer) <= 0){
            console.log("Invalid Input. Returning to Account Actions Menu....");
            accountActionsMenu();
        } else {
            account.deposit(parseFloat(answer));
        }
    })
}

function withdrawMenu() {
    rl.question("\nPlease enter the amount you like to withdraw (x to return to previous menu): ", (answer: string) => {
        if(answer == "x"){
            console.log("Returning to Account Actions Menu....");
            accountActionsMenu();
        }

        if((typeof(parseFloat(answer)) != "number") || parseFloat(answer) <= 0){
            console.log("Invalid Input. Returning to Account Actions Menu....");
            accountActionsMenu();
        } else {
            account.withdraw(parseFloat(answer));
        }
    })
}