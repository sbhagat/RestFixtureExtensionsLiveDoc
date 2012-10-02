/*  Copyright 2011 Fabrizio Cannizzo
 *
 *  This file is part of RestFixture.
 *
 *  RestFixture (http://code.google.com/p/rest-fixture/) is free software:
 *  you can redistribute it and/or modify it under the terms of the
 *  GNU Lesser General Public License as published by the Free Software Foundation,
 *  either version 3 of the License, or (at your option) any later version.
 *
 *  RestFixture is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with RestFixture.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  If you want to contact the author please leave a comment here
 *  http://smartrics.blogspot.com/2008/08/get-fitnesse-with-some-rest.html
 */
package smartrics.rest.test.fitnesse.fixture;

import fit.ActionFixture;
import fit.Fixture;

/**
 * Supports Let CATs by providing a simple interface to FitNesse symbols map.
 * 
 * @author smartrics
 * 
 */
public class LetTestActionFixture extends ActionFixture {
	private String symbolName;

	public void symbolName(String name) {
		this.symbolName = name;
	}

	public String symbolValue() {
		return (String) Fixture.getSymbol(symbolName);
	}

	public void symbolValue(String val) {
		Fixture.setSymbol(symbolName, val);
	}
}
