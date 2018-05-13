"use strict";
exports.__esModule = true;
var account_1 = require("./account");
var user_1 = require("./user");
var readline = require("readline");
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var users = [
    new user_1.User("Veronica", "demDigits"),
    new user_1.User("Matthew", "password"),
    new user_1.User("Bill", "q1234")
];
users[0]._accounts = [
    new account_1.Account(500, "checking"),
    new account_1.Account(250, "savings")
];
users[1]._accounts = [
    new account_1.Account(1500, "checking"),
    new account_1.Account(5250, "savings")
];
users[2]._accounts = [
    new account_1.Account(2500, "checking"),
    new account_1.Account(3250, "savings")
];
var username;
var password;
var loggedUser;
var account;
// --------------------------------------
// Application
getUsername();
//---------------------------------------
// Functions
function getUsername() {
    rl.question("\nWelcome to MuhBank-TS!\n\nInput your username('q' to quit):", function (answer) {
        if (answer === 'q') {
            rl.close();
        }
        else {
            username = answer;
            getPassword();
        }
    });
}
function getPassword() {
    rl.question("Input your passworkd: ", function (answer) {
        password = answer;
        login();
    });
}
function login() {
    loggedUser = users.filter(function (user) { return user.login(username, password); })[0];
    if (loggedUser) {
        console.log("Successfully logged in user: " + loggedUser.username + " \n");
        userAccountsMenu();
    }
    else {
        getUsername();
    }
}
function userAccountsMenu() {
    rl.question("\nUser Accounts Menu\n[1] - Checking\n[2] - Savings\n[3] - Exit\nSelection: ", function (answer) {
        if (answer == "1") {
            account = loggedUser._accounts.filter(function (account) { return account.type == "checking"; })[0];
            console.log("Navigation to Account Action Menu...");
            accountActionsMenu();
        }
        else if (answer == "2") {
            account = loggedUser._accounts.filter(function (account) { return account.type == "savings"; })[0];
            console.log("Navigating to Accnount Actions Menu ...");
            accountActionsMenu();
        }
        else if (answer == "3") {
            console.clear();
            console.log("\nUser, " + loggedUser.username + ", has been logged out");
            loggedUser.username = '';
            loggedUser.password = '';
            getUsername();
        }
        else {
            console.log("Invalid input, please try again...");
            userAccountsMenu();
        }
    });
}
function accountActionsMenu() {
    rl.question("\nAccount Actions Menu\n[1] - Deposit\n[2] - Withdraw\n[3] - View Balance\n[4] - Previous Menu\n Selection:  ", function (answer) {
        if (answer == "1") {
            depositMenu();
        }
        else if (answer == "2") {
            withdrawMenu();
        }
        else if (answer == "3") {
            console.log("Current balance of " + account.type + ": " + account.balance);
            accountActionsMenu();
        }
        else if (answer == "4") {
            userAccountsMenu();
        }
        else {
            console.log("Invalid input, please try again");
            accountActionsMenu();
        }
    });
}
function depositMenu() {
    rl.question("\nPlease enter the amount you like to deposit (x to return to previous menu): ", function (answer) {
        if (answer == "x") {
            console.log("Returning to Account Actions Menu....");
            accountActionsMenu();
        }
        if ((typeof (parseFloat(answer)) != "number") || parseFloat(answer) <= 0) {
            console.log("Invalid Input. Returning to Account Actions Menu....");
            accountActionsMenu();
        }
        else {
            account.deposit(parseFloat(answer));
        }
    });
}
function withdrawMenu() {
    rl.question("\nPlease enter the amount you like to withdraw (x to return to previous menu): ", function (answer) {
        if (answer == "x") {
            console.log("Returning to Account Actions Menu....");
            accountActionsMenu();
        }
        if ((typeof (parseFloat(answer)) != "number") || parseFloat(answer) <= 0) {
            console.log("Invalid Input. Returning to Account Actions Menu....");
            accountActionsMenu();
        }
        else {
            account.withdraw(parseFloat(answer));
        }
    });
}
