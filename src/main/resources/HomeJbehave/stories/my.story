Given firefox started
And proceed to http://www.weather-forecast.com/
When you input <capital> name in the search input
And proper <country> will be selected
Then Temperature for today will be printed
Then Change to F and print
Then Driver quit

Examples:
|capital|country|
|Kiev|ua|
|Prague|cz|
|Moskou|ru|
|Rome|it|
|Oslo|no|

