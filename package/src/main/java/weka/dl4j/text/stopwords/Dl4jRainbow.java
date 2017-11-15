/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 *    Dl4jRainbow.java
 *    Copyright (C) 1999-2017 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.dl4j.text.stopwords;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 *
 * @author fracpete, Felipe Bravo-Marquez
 */
public class Dl4jRainbow extends Dl4jAbstractStopwords {

  /** for serialization. */
  private static final long serialVersionUID = -722795295494945193L;

  /** The hash set containing the list of stopwords. */
  protected List<String> stopWords;

  /**
   * Returns a string describing the stopwords scheme.
   *
   * @return a description suitable for displaying in the gui
   */
  @Override
  public String globalInfo() {
    return "Stopwords list based on Rainbow:\n" + "http://www.cs.cmu.edu/~mccallum/bow/rainbow/";
  }

  /** Performs intialization of the scheme. */
  @Override
  public void initialize() {

    stopWords = new ArrayList<String>();

    stopWords.add("a");
    stopWords.add("able");
    stopWords.add("about");
    stopWords.add("above");
    stopWords.add("according");
    stopWords.add("accordingly");
    stopWords.add("across");
    stopWords.add("actually");
    stopWords.add("after");
    stopWords.add("afterwards");
    stopWords.add("again");
    stopWords.add("against");
    stopWords.add("all");
    stopWords.add("allow");
    stopWords.add("allows");
    stopWords.add("almost");
    stopWords.add("alone");
    stopWords.add("along");
    stopWords.add("already");
    stopWords.add("also");
    stopWords.add("although");
    stopWords.add("always");
    stopWords.add("am");
    stopWords.add("among");
    stopWords.add("amongst");
    stopWords.add("an");
    stopWords.add("and");
    stopWords.add("another");
    stopWords.add("any");
    stopWords.add("anybody");
    stopWords.add("anyhow");
    stopWords.add("anyone");
    stopWords.add("anything");
    stopWords.add("anyway");
    stopWords.add("anyways");
    stopWords.add("anywhere");
    stopWords.add("apart");
    stopWords.add("appear");
    stopWords.add("appreciate");
    stopWords.add("appropriate");
    stopWords.add("are");
    stopWords.add("around");
    stopWords.add("as");
    stopWords.add("aside");
    stopWords.add("ask");
    stopWords.add("asking");
    stopWords.add("associated");
    stopWords.add("at");
    stopWords.add("available");
    stopWords.add("away");
    stopWords.add("awfully");
    stopWords.add("b");
    stopWords.add("be");
    stopWords.add("became");
    stopWords.add("because");
    stopWords.add("become");
    stopWords.add("becomes");
    stopWords.add("becoming");
    stopWords.add("been");
    stopWords.add("before");
    stopWords.add("beforehand");
    stopWords.add("behind");
    stopWords.add("being");
    stopWords.add("believe");
    stopWords.add("below");
    stopWords.add("beside");
    stopWords.add("besides");
    stopWords.add("best");
    stopWords.add("better");
    stopWords.add("between");
    stopWords.add("beyond");
    stopWords.add("both");
    stopWords.add("brief");
    stopWords.add("but");
    stopWords.add("by");
    stopWords.add("c");
    stopWords.add("came");
    stopWords.add("can");
    stopWords.add("cannot");
    stopWords.add("cant");
    stopWords.add("cause");
    stopWords.add("causes");
    stopWords.add("certain");
    stopWords.add("certainly");
    stopWords.add("changes");
    stopWords.add("clearly");
    stopWords.add("co");
    stopWords.add("com");
    stopWords.add("come");
    stopWords.add("comes");
    stopWords.add("concerning");
    stopWords.add("consequently");
    stopWords.add("consider");
    stopWords.add("considering");
    stopWords.add("contain");
    stopWords.add("containing");
    stopWords.add("contains");
    stopWords.add("corresponding");
    stopWords.add("could");
    stopWords.add("course");
    stopWords.add("currently");
    stopWords.add("d");
    stopWords.add("definitely");
    stopWords.add("described");
    stopWords.add("despite");
    stopWords.add("did");
    stopWords.add("different");
    stopWords.add("do");
    stopWords.add("does");
    stopWords.add("doing");
    stopWords.add("done");
    stopWords.add("down");
    stopWords.add("downwards");
    stopWords.add("during");
    stopWords.add("e");
    stopWords.add("each");
    stopWords.add("edu");
    stopWords.add("eg");
    stopWords.add("eight");
    stopWords.add("either");
    stopWords.add("else");
    stopWords.add("elsewhere");
    stopWords.add("enough");
    stopWords.add("entirely");
    stopWords.add("especially");
    stopWords.add("et");
    stopWords.add("etc");
    stopWords.add("even");
    stopWords.add("ever");
    stopWords.add("every");
    stopWords.add("everybody");
    stopWords.add("everyone");
    stopWords.add("everything");
    stopWords.add("everywhere");
    stopWords.add("ex");
    stopWords.add("exactly");
    stopWords.add("example");
    stopWords.add("except");
    stopWords.add("f");
    stopWords.add("far");
    stopWords.add("few");
    stopWords.add("fifth");
    stopWords.add("first");
    stopWords.add("five");
    stopWords.add("followed");
    stopWords.add("following");
    stopWords.add("follows");
    stopWords.add("for");
    stopWords.add("former");
    stopWords.add("formerly");
    stopWords.add("forth");
    stopWords.add("four");
    stopWords.add("from");
    stopWords.add("further");
    stopWords.add("furthermore");
    stopWords.add("g");
    stopWords.add("get");
    stopWords.add("gets");
    stopWords.add("getting");
    stopWords.add("given");
    stopWords.add("gives");
    stopWords.add("go");
    stopWords.add("goes");
    stopWords.add("going");
    stopWords.add("gone");
    stopWords.add("got");
    stopWords.add("gotten");
    stopWords.add("greetings");
    stopWords.add("h");
    stopWords.add("had");
    stopWords.add("happens");
    stopWords.add("hardly");
    stopWords.add("has");
    stopWords.add("have");
    stopWords.add("having");
    stopWords.add("he");
    stopWords.add("hello");
    stopWords.add("help");
    stopWords.add("hence");
    stopWords.add("her");
    stopWords.add("here");
    stopWords.add("hereafter");
    stopWords.add("hereby");
    stopWords.add("herein");
    stopWords.add("hereupon");
    stopWords.add("hers");
    stopWords.add("herself");
    stopWords.add("hi");
    stopWords.add("him");
    stopWords.add("himself");
    stopWords.add("his");
    stopWords.add("hither");
    stopWords.add("hopefully");
    stopWords.add("how");
    stopWords.add("howbeit");
    stopWords.add("however");
    stopWords.add("i");
    stopWords.add("ie");
    stopWords.add("if");
    stopWords.add("ignored");
    stopWords.add("immediate");
    stopWords.add("in");
    stopWords.add("inasmuch");
    stopWords.add("inc");
    stopWords.add("indeed");
    stopWords.add("indicate");
    stopWords.add("indicated");
    stopWords.add("indicates");
    stopWords.add("inner");
    stopWords.add("insofar");
    stopWords.add("instead");
    stopWords.add("into");
    stopWords.add("inward");
    stopWords.add("is");
    stopWords.add("it");
    stopWords.add("its");
    stopWords.add("itself");
    stopWords.add("j");
    stopWords.add("just");
    stopWords.add("k");
    stopWords.add("keep");
    stopWords.add("keeps");
    stopWords.add("kept");
    stopWords.add("know");
    stopWords.add("knows");
    stopWords.add("known");
    stopWords.add("l");
    stopWords.add("last");
    stopWords.add("lately");
    stopWords.add("later");
    stopWords.add("latter");
    stopWords.add("latterly");
    stopWords.add("least");
    stopWords.add("less");
    stopWords.add("lest");
    stopWords.add("let");
    stopWords.add("like");
    stopWords.add("liked");
    stopWords.add("likely");
    stopWords.add("little");
    stopWords.add("ll"); // added to avoid stopWords like you'll,I'll etc.
    stopWords.add("look");
    stopWords.add("looking");
    stopWords.add("looks");
    stopWords.add("ltd");
    stopWords.add("m");
    stopWords.add("mainly");
    stopWords.add("many");
    stopWords.add("may");
    stopWords.add("maybe");
    stopWords.add("me");
    stopWords.add("mean");
    stopWords.add("meanwhile");
    stopWords.add("merely");
    stopWords.add("might");
    stopWords.add("more");
    stopWords.add("moreover");
    stopWords.add("most");
    stopWords.add("mostly");
    stopWords.add("much");
    stopWords.add("must");
    stopWords.add("my");
    stopWords.add("myself");
    stopWords.add("n");
    stopWords.add("name");
    stopWords.add("namely");
    stopWords.add("nd");
    stopWords.add("near");
    stopWords.add("nearly");
    stopWords.add("necessary");
    stopWords.add("need");
    stopWords.add("needs");
    stopWords.add("neither");
    stopWords.add("never");
    stopWords.add("nevertheless");
    stopWords.add("new");
    stopWords.add("next");
    stopWords.add("nine");
    stopWords.add("no");
    stopWords.add("nobody");
    stopWords.add("non");
    stopWords.add("none");
    stopWords.add("noone");
    stopWords.add("nor");
    stopWords.add("normally");
    stopWords.add("not");
    stopWords.add("nothing");
    stopWords.add("novel");
    stopWords.add("now");
    stopWords.add("nowhere");
    stopWords.add("o");
    stopWords.add("obviously");
    stopWords.add("of");
    stopWords.add("off");
    stopWords.add("often");
    stopWords.add("oh");
    stopWords.add("ok");
    stopWords.add("okay");
    stopWords.add("old");
    stopWords.add("on");
    stopWords.add("once");
    stopWords.add("one");
    stopWords.add("ones");
    stopWords.add("only");
    stopWords.add("onto");
    stopWords.add("or");
    stopWords.add("other");
    stopWords.add("others");
    stopWords.add("otherwise");
    stopWords.add("ought");
    stopWords.add("our");
    stopWords.add("ours");
    stopWords.add("ourselves");
    stopWords.add("out");
    stopWords.add("outside");
    stopWords.add("over");
    stopWords.add("overall");
    stopWords.add("own");
    stopWords.add("p");
    stopWords.add("particular");
    stopWords.add("particularly");
    stopWords.add("per");
    stopWords.add("perhaps");
    stopWords.add("placed");
    stopWords.add("please");
    stopWords.add("plus");
    stopWords.add("possible");
    stopWords.add("presumably");
    stopWords.add("probably");
    stopWords.add("provides");
    stopWords.add("q");
    stopWords.add("que");
    stopWords.add("quite");
    stopWords.add("qv");
    stopWords.add("r");
    stopWords.add("rather");
    stopWords.add("rd");
    stopWords.add("re");
    stopWords.add("really");
    stopWords.add("reasonably");
    stopWords.add("regarding");
    stopWords.add("regardless");
    stopWords.add("regards");
    stopWords.add("relatively");
    stopWords.add("respectively");
    stopWords.add("right");
    stopWords.add("s");
    stopWords.add("said");
    stopWords.add("same");
    stopWords.add("saw");
    stopWords.add("say");
    stopWords.add("saying");
    stopWords.add("says");
    stopWords.add("second");
    stopWords.add("secondly");
    stopWords.add("see");
    stopWords.add("seeing");
    stopWords.add("seem");
    stopWords.add("seemed");
    stopWords.add("seeming");
    stopWords.add("seems");
    stopWords.add("seen");
    stopWords.add("self");
    stopWords.add("selves");
    stopWords.add("sensible");
    stopWords.add("sent");
    stopWords.add("serious");
    stopWords.add("seriously");
    stopWords.add("seven");
    stopWords.add("several");
    stopWords.add("shall");
    stopWords.add("she");
    stopWords.add("should");
    stopWords.add("since");
    stopWords.add("six");
    stopWords.add("so");
    stopWords.add("some");
    stopWords.add("somebody");
    stopWords.add("somehow");
    stopWords.add("someone");
    stopWords.add("something");
    stopWords.add("sometime");
    stopWords.add("sometimes");
    stopWords.add("somewhat");
    stopWords.add("somewhere");
    stopWords.add("soon");
    stopWords.add("sorry");
    stopWords.add("specified");
    stopWords.add("specify");
    stopWords.add("specifying");
    stopWords.add("still");
    stopWords.add("sub");
    stopWords.add("such");
    stopWords.add("sup");
    stopWords.add("sure");
    stopWords.add("t");
    stopWords.add("take");
    stopWords.add("taken");
    stopWords.add("tell");
    stopWords.add("tends");
    stopWords.add("th");
    stopWords.add("than");
    stopWords.add("thank");
    stopWords.add("thanks");
    stopWords.add("thanx");
    stopWords.add("that");
    stopWords.add("thats");
    stopWords.add("the");
    stopWords.add("their");
    stopWords.add("theirs");
    stopWords.add("them");
    stopWords.add("themselves");
    stopWords.add("then");
    stopWords.add("thence");
    stopWords.add("there");
    stopWords.add("thereafter");
    stopWords.add("thereby");
    stopWords.add("therefore");
    stopWords.add("therein");
    stopWords.add("theres");
    stopWords.add("thereupon");
    stopWords.add("these");
    stopWords.add("they");
    stopWords.add("think");
    stopWords.add("third");
    stopWords.add("this");
    stopWords.add("thorough");
    stopWords.add("thoroughly");
    stopWords.add("those");
    stopWords.add("though");
    stopWords.add("three");
    stopWords.add("through");
    stopWords.add("throughout");
    stopWords.add("thru");
    stopWords.add("thus");
    stopWords.add("to");
    stopWords.add("together");
    stopWords.add("too");
    stopWords.add("took");
    stopWords.add("toward");
    stopWords.add("towards");
    stopWords.add("tried");
    stopWords.add("tries");
    stopWords.add("truly");
    stopWords.add("try");
    stopWords.add("trying");
    stopWords.add("twice");
    stopWords.add("two");
    stopWords.add("u");
    stopWords.add("un");
    stopWords.add("under");
    stopWords.add("unfortunately");
    stopWords.add("unless");
    stopWords.add("unlikely");
    stopWords.add("until");
    stopWords.add("unto");
    stopWords.add("up");
    stopWords.add("upon");
    stopWords.add("us");
    stopWords.add("use");
    stopWords.add("used");
    stopWords.add("useful");
    stopWords.add("uses");
    stopWords.add("using");
    stopWords.add("usually");
    stopWords.add("uucp");
    stopWords.add("v");
    stopWords.add("value");
    stopWords.add("various");
    stopWords.add("ve"); // added to avoid stopWords like I've,you've etc.
    stopWords.add("very");
    stopWords.add("via");
    stopWords.add("viz");
    stopWords.add("vs");
    stopWords.add("w");
    stopWords.add("want");
    stopWords.add("wants");
    stopWords.add("was");
    stopWords.add("way");
    stopWords.add("we");
    stopWords.add("welcome");
    stopWords.add("well");
    stopWords.add("went");
    stopWords.add("were");
    stopWords.add("what");
    stopWords.add("whatever");
    stopWords.add("when");
    stopWords.add("whence");
    stopWords.add("whenever");
    stopWords.add("where");
    stopWords.add("whereafter");
    stopWords.add("whereas");
    stopWords.add("whereby");
    stopWords.add("wherein");
    stopWords.add("whereupon");
    stopWords.add("wherever");
    stopWords.add("whether");
    stopWords.add("which");
    stopWords.add("while");
    stopWords.add("whither");
    stopWords.add("who");
    stopWords.add("whoever");
    stopWords.add("whole");
    stopWords.add("whom");
    stopWords.add("whose");
    stopWords.add("why");
    stopWords.add("will");
    stopWords.add("willing");
    stopWords.add("wish");
    stopWords.add("with");
    stopWords.add("within");
    stopWords.add("without");
    stopWords.add("wonder");
    stopWords.add("would");
    stopWords.add("would");
    stopWords.add("x");
    stopWords.add("y");
    stopWords.add("yes");
    stopWords.add("yet");
    stopWords.add("you");
    stopWords.add("your");
    stopWords.add("yours");
    stopWords.add("yourself");
    stopWords.add("yourselves");
    stopWords.add("z");
    stopWords.add("zero");
  }

  /**
   * Returns true if the given string is a stop word.
   *
   * @param word the word to test
   * @return true if the word is a stopword
   */
  @Override
  protected boolean is(String word) {
    return stopWords.contains(word.trim().toLowerCase());
  }

  /* (non-Javadoc)
   * @see weka.dl4j.text.stopwords.Dl4jAbstractStopwords#getStopList()
   */
  @Override
  public List<String> getStopList() {
    return this.stopWords;
  }
}
