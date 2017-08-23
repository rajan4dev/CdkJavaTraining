export class Person{
	
	name:string = "";
	age:number = 0;
	phone:string = "";
	avatar:string = "";


	constructor(name:string = 'Jagga Chaudhary',age:number = 50,phone:string = '981010000',avatar:string = 'images/adv2.jpg'){
		console.log("Person initialized!!!!!!");
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.avatar = avatar;
	}


}