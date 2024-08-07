import unittest

from greeting import greeting


class TestGreeting(unittest.TestCase):
    def test_should_return_Hello_World(self):
        self.assertEqual(greeting(), "Hello, World!")


if __name__ == '__main__':
    unittest.main()
