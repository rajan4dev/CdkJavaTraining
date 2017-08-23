"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class CalService {
    constructor() {
        console.log("Inside CalService.constructor()");
    }
    add(valOne, valTwo) {
        console.log("Inside CalService.add()");
        return valOne + valTwo;
    }
    subtract(valOne, valTwo) {
        console.log("Inside CalService.subtract()");
        return valOne - valTwo;
    }
}
exports.CalService = CalService;
//# sourceMappingURL=cal.service.js.map