package seedu.address.model.expenditureinfo;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Expenditure's category in the expenditure tracker.
 * Guarantees: immutable; is valid as declared in {@link #isValidCategory(String)}
 */
public class Category {

    public static final String MESSAGE_CATEGORY_CONSTRAINTS =
            "Category can only take few values, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    //public static final String CATEGORY_VALIDATION_REGEX = "[^\\s].*";

    public final String categoryName;

    /**
     * Constructs a {@code Category}.
     *
     * @param category A valid category.
     */
    public Category(String category) {
        requireNonNull(category);
        checkArgument(isValidCategory(category), MESSAGE_CATEGORY_CONSTRAINTS);
        categoryName = category;
    }

    /**
     * Returns true if a given string is a valid category.
     */
    public static boolean isValidCategory(String test) {
        return test.equals("Food")
                || test.equals("Drink")
                || test.equals("Clothing")
                || test.equals("Electronics")
                || test.equals("DailyNecessities")
                || test.equals("Sports")
                || test.equals("Communications")
                || test.equals("Travels")
                || test.equals("Study")
                || test.equals("Office")
                || test.equals("Pets")
                || test.equals("Gifts")
                || test.equals("Entertainment")
                || test.equals("Traffic")
                || test.equals("Shopping")
                || test.equals("Beauty")
                || test.equals("Furniture");
    }


    @Override
    public String toString() {
        return categoryName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Category // instanceof handles nulls
                && categoryName.equals(((Category) other).categoryName)); // state check
    }

    @Override
    public int hashCode() {
        return categoryName.hashCode();
    }

}
