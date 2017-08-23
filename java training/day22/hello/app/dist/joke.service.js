"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class JokeService {
    constructor() {
        this.jokes = ['Fridays are very boring.', 'Mondays are always welcome.', 'Wednesdays are amazing.', 'Thursdays are ok ok.'];
    }
    nextJoke() {
        console.log("Inside JokeService.nextJoke()");
        let idx = Math.floor(Math.random() * this.jokes.length);
        return this.jokes[idx];
    }
}
exports.JokeService = JokeService;
//# sourceMappingURL=joke.service.js.map