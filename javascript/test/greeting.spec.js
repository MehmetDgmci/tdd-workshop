const assert = require('assert')
const greeting = require('../src/greeting')

describe('Greeting', () => {
    it('should return Hello World', () => {
        assert.strictEqual(greeting(), 'Hello, world!')
    })
})
