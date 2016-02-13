from flask import Flask, render_template

app = Flask(__name__)
app.config["DEBUG"] = True

@app.route("/")
def hello():
	return render_template("hello.html")

@app.route("/name")
def name():
	return "Your Name"

@app.route("/search/<search_query>")
def search(search_query):
	return search_query
@app.route("/search")

if __name__ == "__main__":
	app.run(host="0.0.0.0")