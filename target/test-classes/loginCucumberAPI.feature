Feature: validate login functionality


Scenario: validate login with incorrect username
Given set base URI "http://a.testaddressbook.com"
Then set request header content-Type "Content-Type" "application/x-www-form-urlencoded"
Then set request header Cookie "Cookie" "_address_book_session=U0FJSnRwMHk2cXl1a2Q0YzFYSG9mMzJqaU5IUUR4dlk1N2dNMFE5Uit0ekMrYXR5dEljQytEWVJMb1ROSkRPMmxVTzBCQ040cSs3eVdQN1RQak50K2RIZ1FOUktodDYzdTd4SUxiWVhBcFJQRHJYYkJ6ZEUwTmhYWkVnWmp3MEJmc3BGUUJHNTZ1RXZBUTZHMVhJVGNnPT0tLXpwWU9SK0p5Tk5EbHVoZG1jYkpqWUE9PQ==--8fa359ef24509507b4bb342158bf90b60ff96e4b"
Then set param utf8 "utf8" "true"
Then set param authenticity_token "authenticity_token" "jTiEfXl/E/jHz++FJENvZCf+JfQjwVolXFt1/YSi2OUE/+u9TX5a7IZrF5tKMV4UYR0SZihjwNDARXcRbBVt8Q=="
Then set param username "session[email]" "demo12@demo.com"
Then set param password "session[password]" "demo"
Then set param action "commit" "Sign in"
Then send post call "/session"
Then validate response code "401"

Scenario: validate login with incorrect password
Given set base URI "http://a.testaddressbook.com"
Then set request header content-Type "Content-Type" "application/x-www-form-urlencoded"
Then set request header Cookie "Cookie" "_address_book_session=U0FJSnRwMHk2cXl1a2Q0YzFYSG9mMzJqaU5IUUR4dlk1N2dNMFE5Uit0ekMrYXR5dEljQytEWVJMb1ROSkRPMmxVTzBCQ040cSs3eVdQN1RQak50K2RIZ1FOUktodDYzdTd4SUxiWVhBcFJQRHJYYkJ6ZEUwTmhYWkVnWmp3MEJmc3BGUUJHNTZ1RXZBUTZHMVhJVGNnPT0tLXpwWU9SK0p5Tk5EbHVoZG1jYkpqWUE9PQ==--8fa359ef24509507b4bb342158bf90b60ff96e4b"
Then set param utf8 "utf8" "true"
Then set param authenticity_token "authenticity_token" "jTiEfXl/E/jHz++FJENvZCf+JfQjwVolXFt1/YSi2OUE/+u9TX5a7IZrF5tKMV4UYR0SZihjwNDARXcRbBVt8Q=="
Then set param username "session[email]" "demo@demo.com"
Then set param password "session[password]" "demo12"
Then set param action "commit" "Sign in"
Then send post call "/session"
Then validate response code "401"

Scenario: validate login with correct credentials
Given set base URI "http://a.testaddressbook.com"
Then set request header content-Type "Content-Type" "application/x-www-form-urlencoded"
Then set request header Cookie "Cookie" "_address_book_session=U0FJSnRwMHk2cXl1a2Q0YzFYSG9mMzJqaU5IUUR4dlk1N2dNMFE5Uit0ekMrYXR5dEljQytEWVJMb1ROSkRPMmxVTzBCQ040cSs3eVdQN1RQak50K2RIZ1FOUktodDYzdTd4SUxiWVhBcFJQRHJYYkJ6ZEUwTmhYWkVnWmp3MEJmc3BGUUJHNTZ1RXZBUTZHMVhJVGNnPT0tLXpwWU9SK0p5Tk5EbHVoZG1jYkpqWUE9PQ==--8fa359ef24509507b4bb342158bf90b60ff96e4b"
Then set param utf8 "utf8" "true"
Then set param authenticity_token "authenticity_token" "jTiEfXl/E/jHz++FJENvZCf+JfQjwVolXFt1/YSi2OUE/+u9TX5a7IZrF5tKMV4UYR0SZihjwNDARXcRbBVt8Q=="
Then set param username "session[email]" "demo@demo.com"
Then set param password "session[password]" "demo"
Then set param action "commit" "Sign in"
Then send post call "/session"
Then validate response code "302"