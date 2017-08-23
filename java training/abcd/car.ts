export class Car{
    carId:number;
    make:string = "";

   fuel:string = "";


    constructor(make: string, fuel: string) {
        this.make = make;
        this.fuel = fuel;
    }
}