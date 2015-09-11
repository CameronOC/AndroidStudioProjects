from flask import Flask, render_template
app = Flask(__name__)
app.config['DEBUG'] = True


# Note: We don't need to call run() since our application is embedded within

# the App Engine WSGI application server.


@app.route('/')
def hello():
    """Return a friendly HTTP greeting."""
    return render_template("index.html", Candidate = "Bernie Sanders", dRank = "1", dName = "UNITE HERE", dAmount = "$15,000" )


@app.errorhandler(404)
def page_not_found(e):
    """Return a custom 404 error."""
    return 'Sorry, nothing at this URL.', 404

@app.errorhandler(500)
def application_error(e):
	"""Return a custom 500 error. """
	return 'Something went wrong D:, unexpected error: {}'.format(e), 500