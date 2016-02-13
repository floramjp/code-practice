import requests

url = "https://www.googleapis.com/books/v1/volumes?q=Treasure%20Island"
response = requests.get(url)

print response
