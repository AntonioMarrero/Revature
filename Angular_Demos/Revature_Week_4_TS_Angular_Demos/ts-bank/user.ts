import { Account } from './account';

export class User {
   private _username: string;
   private _password: string;
    _accounts: Account[] = [];

    constructor(username: string, password: string) {
        this._username = username;
        this._password = password;
    }

    get username(){
        return this._username;
    }

    set username(value: string){
        this._username = value;
    }

    get password(){
        return this._password;
    }

    set password(value: string){
        this._password = value;
    }

    login(user: string, pass: string): boolean{
        return this._username === user && this._password === pass;
    }

    getAccount(type: string){
        return this._accounts.filter((account: Account) => account.type == type)[0];
    
    }

}