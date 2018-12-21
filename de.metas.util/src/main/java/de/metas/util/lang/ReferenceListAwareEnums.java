package de.metas.util.lang;

import java.util.Arrays;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import lombok.experimental.UtilityClass;

/*
 * #%L
 * de.metas.util
 * %%
 * Copyright (C) 2018 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

@UtilityClass
public class ReferenceListAwareEnums
{
	public static <T extends ReferenceListAwareEnum> ImmutableMap<String, T> indexByCode(final T[] values)
	{
		return Maps.uniqueIndex(Arrays.asList(values), ReferenceListAwareEnum::getCode);
	}
}