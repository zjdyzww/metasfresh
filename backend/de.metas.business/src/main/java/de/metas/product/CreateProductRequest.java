package de.metas.product;

import de.metas.organization.OrgId;
import de.metas.sectionCode.SectionCodeId;
import de.metas.uom.UomId;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import javax.annotation.Nullable;
import java.time.LocalDate;

/*
 * #%L
 * de.metas.business
 * %%
 * Copyright (C) 2019 metas GmbH
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

@Value
@Builder
public class CreateProductRequest
{
	@NonNull
	OrgId orgId;

	@Nullable
	String productValue;

	@NonNull
	String productName;
	@NonNull
	ProductCategoryId productCategoryId;

	@NonNull
	String productType;

	@NonNull
	UomId uomId;

	boolean purchased;
	boolean sold;

	@Nullable
	Boolean bomVerified;

	@Nullable
	ProductPlanningSchemaSelector planningSchemaSelector;

	@Nullable
	String ean;

	@Nullable
	String gtin;

	@Nullable
	String description;

	@Nullable
	Boolean discontinued;

	@Nullable
	LocalDate discontinuedFrom;

	@Nullable
	Boolean active;

	@Nullable
	Boolean stocked;

	@Nullable
	SectionCodeId sectionCodeId;
}
