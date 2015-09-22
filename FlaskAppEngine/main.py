from flask import Flask, render_template
from lxml import html
import requests
import string
app = Flask(__name__)

def funding(website):
    page = requests.get(website)
    tree = html.fromstring(page.text)
    donor = tree.xpath('//td[@class="span-4"]/text()')
    donors = donor[5:15]
    return donors
    
@app.route('/')
def hello():
    """Return a friendly HTTP greeting."""
    return render_template("index.html", Candidate = "Bernie Sanders",
                           Rank = "1",
                           Donor = funding('http://votesmart.org/candidate/campaign-finance/27110/bernie-sanders#.Vfq5ft9VhBc')
                            )


@app.errorhandler(404)
def page_not_found(e):
    """Return a custom 404 error."""
    return 'Sorry, nothing at this URL.', 404

@app.errorhandler(500)
def application_error(e):
	"""Return a custom 500 error. """
	return 'Something went wrong D:, unexpected error: {}'.format(e), 500


if __name__ == '__main__':
    app.run(debug=True)
