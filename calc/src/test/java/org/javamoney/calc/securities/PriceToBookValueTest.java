/*
 * Copyright (c) 2012, 2018, Werner Keil, Anatole Tresch and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Contributors: @manuela-grindei
 */
package org.javamoney.calc.securities;


import org.javamoney.moneta.Money;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * @author Manuela Grindei
 */
public class PriceToBookValueTest {

    private static final Money MARKET_PRICE_PER_SHARE = Money.of(120, "GBP");
    private static final Money BOOK_VALUE_PER_SHARE = Money.of(240, "GBP");

    @Test
    public void testCalculate() {
        assertEquals(BigDecimal.valueOf(0.5), PriceToBookValue.calculate(MARKET_PRICE_PER_SHARE, BOOK_VALUE_PER_SHARE));
    }
}