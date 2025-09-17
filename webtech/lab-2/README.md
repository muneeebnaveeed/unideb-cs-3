# Web Technologies - Lab 2 Notes

## Lab Overview

This lab covers XML document structure, DTD (Document Type Definition), and CSS styling for XML documents using a Shakespeare play example.

## VSCode Configuration

### Essential Extensions

- **XML Extension**: Enables XML syntax highlighting, validation, and IntelliSense features
- **Emmet**: Speeds up markup writing with abbreviations and shortcuts

### VSCode Settings

- **Linked Editing**: Configure to edit opening/closing tags simultaneously
- **XML Snippets**: Type `<?` in the editor to access XML extension snippets

### Emmet Features

- **Command Palette Access**: Press `Ctrl+Shift+P` to access Emmet macros
- **Wrap with Abbreviation**: Select code and use Emmet to wrap with tags
- **Repeating Elements**: Use `*` for repeating elements (e.g., `div*3` creates three `<div>` elements)

## XML Fundamentals

### XML Comments

```xml
<!-- This is an XML comment -->
<!-- Comments are useful for documentation and notes -->
```

### XML Document Structure

- **XML Declaration**: `<?xml version="1.0" encoding="UTF-8"?>`
- **DTD Reference**: `<!DOCTYPE play SYSTEM "play.dtd">`
- **CSS Linking**: `<?xml-stylesheet href="play.css" type="text/css"?>`

## Document Type Definition (DTD)

### What is DTD?

Document Type Definition defines the structure, elements, attributes, and rules for XML files.

### Why Use DTD?

- Ensures XML files follow a specific format
- Provides validation for document structure
- Defines element relationships and constraints

### DTD Syntax Examples

```dtd
<!ELEMENT play (author, title, act*)>
<!ELEMENT author (#PCDATA)>
<!ELEMENT title (#PCDATA)>
<!ELEMENT act (title, scene*)>
<!ELEMENT scene (title, (speech | stagedir)*)>
<!ELEMENT speech (speaker, (line | stagedir)+)>
<!ELEMENT speaker (#PCDATA)>
<!ELEMENT line (#PCDATA | stagedir)*>
<!ELEMENT stagedir (#PCDATA)>
```

### DTD Rules

- **Order Matters**: Elements must appear in the order specified in DTD
- **Choice Lists**: Use parentheses and `|` for choices, e.g., `(title|author)`
- **Occurrence Indicators**:
  - `*` means zero or more occurrences
  - `+` means one or more occurrences
  - `?` means zero or one occurrence
- **Content Types**:
  - `#PCDATA` means parsed character data (text content)
  - `EMPTY` means no content allowed

## CSS for XML

### XML vs CSS Differences

- **XML**: Uses arbitrary, user-defined tags
- **CSS**: Uses fixed set of ~600-700 selectors (verify at [caniuse.com](https://caniuse.com){:target="\_blank"})
- **Browser Compatibility**: Not all CSS properties work the same in every browser

### Linking CSS to XML

```xml
<?xml-stylesheet type="text/css" href="style.css"?>
```

### CSS Structure

```css
selector {
  property: value;
  property: value;
}
```

### Key CSS Concepts

#### Selectors

- **Universal Selector (`*`)**: Selects all elements
- **Element Selector**: Targets specific elements (e.g., `play`, `speech`)
- **Pseudo-element Selectors**: `::before`, `::after` add content before/after elements

#### Display Modes

- `block`: Elements take full width and start on new line
- `inline`: Elements flow with text content
- `flex`: Flexible box layout
- `grid`: Grid layout system

#### Box Model

Elements have four areas:

1. **Content**: The actual content
2. **Padding**: Space inside the element
3. **Border**: Border around the element
4. **Margin**: Space outside the element

#### Typography

- **Font Family**: Use fallback fonts and web-safe fonts
- **Font Variants**: `font-variant: small-caps` for small capital letters
- **Font Resources**: Check [modernfontstacks.com](https://modernfontstacks.com){:target="\_blank"} for good font combinations

#### Units

- **Relative Units**: Prefer `em`, `ch`, `%` over `px` for better scalability
- **Character Units**: `ch` represents the width of the "0" character

#### Shorthand Properties

```css
/* Instead of */
margin-top: 10px;
margin-right: 20px;
margin-bottom: 10px;
margin-left: 20px;

/* Use shorthand */
margin: 10px 20px;
```

#### Pseudo-elements with Content

```css
stagedir::before {
  content: "(";
}

stagedir::after {
  content: ") ";
}
```

### Emmet for CSS

Use Emmet abbreviations for quick property insertion:

- `m10` → `margin: 10px;`
- `p20` → `padding: 20px;`
- `fz16` → `font-size: 16px;`

## Key Takeaways

1. **XML Structure**: Well-formed XML with proper DTD validation
2. **CSS Integration**: Seamless styling of XML documents
3. **Typography**: Professional font choices and spacing
4. **Layout**: Responsive design using relative units
5. **Accessibility**: Proper semantic structure and readable formatting

## Resources

- [Can I Use](https://caniuse.com){:target="\_blank"} - Browser compatibility checker
- [Modern Font Stacks](https://modernfontstacks.com){:target="\_blank"} - Font combination recommendations
- [Emmet Documentation](https://docs.emmet.io){:target="\_blank"} - Complete Emmet reference
- [CSS Box Model](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Box_Model){:target="\_blank"} - MDN documentation
