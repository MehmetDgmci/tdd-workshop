package tdd_test

import (
	. "github.com/onsi/ginkgo/v2"
	. "github.com/onsi/gomega"
	"tdd"
)

var _ = Describe("Greeting", func() {
	It("Should return Hello World", func() {
		Expect(tdd.Greeting()).To(Equal("Hello, World!"))
	})
})
