export class CalService{
	
	constructor(){
		console.log("Inside CalService.constructor()");
	}


	add(valOne:number,valTwo:number){
		console.log("Inside CalService.add()");
		return valOne + valTwo;	
	}

	subtract(valOne:number,valTwo:number){
		console.log("Inside CalService.subtract()");
		return valOne - valTwo;	
	}

}