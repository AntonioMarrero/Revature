export class LikeComponent{
    // likesCount: number;
    // isSelected: boolean;

    constructor(private _likesCount: number, private _isSelected: boolean){

        }

    onClick(){

        // if(this._isSelected){
        //     this._likesCount--;
        //     // this._isSelected = false;

        // } else {

        //     this._likesCount++;
        //     // this._isSelected = true;

        // }

        this._likesCount += (this._isSelected) ? -1 : 1;
        this._isSelected = !this._isSelected;
    }

        get likesCount(){
            return this._likesCount;
        }

        set likesCount(value: number){
            this._likesCount = value;
        }

        get isSelected(){
            return this._isSelected
        }

        set isSelected(value: boolean){
            this._isSelected = value;
        }
        
        
}
