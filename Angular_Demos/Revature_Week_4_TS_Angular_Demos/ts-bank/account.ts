export class Account {
   private _balance: number;
   private _type: string;

    constructor(balance: number, type: string){
        this._balance = balance;
        this._type = type;
    }

    get balance(){
        return this._balance;
    }

    set balance(value: number){
        this._balance = value;
    }

    get type(){
        return this._type;
    }

    set type(value: string){
        this._type = value;
    }

    withdraw(amount: number){
        if(this._balance - amount < 0){
            console.log('Overdafts not permitted. Transaction denied!')
        }
        this._balance -= amount;
    }

    deposit(amount: number){
        if(this._balance + amount > 0){
            this._balance = amount;
        }
    }

}