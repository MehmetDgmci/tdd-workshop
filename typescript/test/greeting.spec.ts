import {assert} from 'chai'
import {greeting} from "../src/greeting";

describe('Greeting', function () {
    it('should return Hello World', function () {
        assert.deepEqual(greeting(), 'Hello, world!');
    })
})
