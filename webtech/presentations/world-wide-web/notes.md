# Web Technologies - World Wide Web Notes

## Historical Origins

### Birth of the Web

- **Birthplace**: The World Wide Web was born in CERN
- **Creator**: Both the idea and implementation came from Tim Berners-Lee (TBL)
- **Reference**: For more information about TBL, see: https://www.w3.org/People/Berners-Lee/
- **Original Proposal**:
  - Tim Berners-Lee. Information Management: A Proposal. March 1989.
  - https://www.w3.org/History/1989/proposal.html
- **Purpose**: He recommended a hypertext information system to CERN
- **Joint Proposal**:
  - Tim Berners-Lee, Robert Cailliau. WorldWideWeb: Proposal for a HyperText Project. 12 November 1990.
  - https://www.w3.org/Proposal.html

### Key Milestones

- **First Web Server**: CERN httpd (December 24, 1990)
  - Reference: https://www.w3.org/Daemon/
- **First Web Browser and HTML Editor**: WorldWideWeb (December 25, 1990)
  - Reference: https://www.w3.org/People/Berners-Lee/WorldWideWeb.html
- **First Public Website**: http://info.cern.ch/ (August 6, 1991)
  - Reference: See "Restoring the first website" at https://first-website.web.cern.ch/first-website/
- **Comprehensive web history**: https://thehistoryoftheweb.com/

## Core Technologies

### TBL's Fundamental Creations

1. **HTML**: HyperText Markup Language
   - Reference: https://info.cern.ch/hypertext/WWW/MarkUp/MarkUp.html
2. **HTTP**: HyperText Transfer Protocol
   - Reference: https://www.w3.org/Protocols/HTTP/AsImplemented.html
3. **URI**: Universal Resource Identifier (originally called UDI - Universal Document Identifier)
   - Reference: https://info.cern.ch/hypertext/WWW/Addressing/Addressing.html

### Original Cornerstones of the Web

1. **Identifying resources by global identifiers (URIs)**
2. **Client-server model**
3. **Hypertext markup language (HTML)**

## Web Architecture

### Contemporary Framework

- **Reference**: Architecture of the World Wide Web, Volume One (W3C Recommendation, 15 December 2004)
- **URL**: https://www.w3.org/TR/webarch/
- **Important Note**: The client-server model is not mentioned at all in the text!

### Core Definitions

- **World Wide Web**: An information space in which the items of interest (referred to as resources) are identified by URIs
- **Resource**: Anything that might be identified by a URI
  - **Information Resource**: A resource which has the property that all of its essential characteristics can be conveyed in a message
- **Uniform Resource Identifier (URI)**: A global identifier in the context of the Web
- **Representation**: Data that encodes information about resource state

### Advanced Concepts

- **Content Negotiation**: Offering multiple representations for a resource and selecting the one that is the most appropriate when a representation must be served
- **Dereferencing a URI**: Using a URI to access the referenced resource
  - **Access Forms**: May take many forms, including:
    - Retrieving
    - Adding
    - Modifying a representation of the resource
    - Deleting some or all representations of the resource

### Web Agents

- **Web Agent**: A person or a piece of software acting on the Web on behalf of a person, entity, or process
  - **Example**: A web crawler
- **User Agent**: One type of Web agent, a piece of software acting on behalf of a person
  - **Example**: A web browser

## Architectural Bases of the Web

### Three Fundamental Principles

#### Identification

- **Resources are identified by global identifiers called URIs**

#### Interaction

- **Web agents communicate using standardized protocols that enable interaction through the exchange of messages**
- **Web protocols include, for example, HTTP, HTTPS, and WebDAV**
- **A message may include data as well as metadata about a resource, the message data, and the message itself**

#### Data Formats

- **The choice of interaction protocol places limits on the formats of representation data and metadata that can be transmitted**
- **The Web itself does not constrain the data formats that can be used by content providers**
- **For a data format to be usefully interoperable between two parties, the parties must agree (to a reasonable extent) about its syntax and semantics**

## Standards

### Definition

- **Standard**: A document that provides requirements, specifications, guidelines or characteristics that can be used consistently to ensure that materials, products, processes and services are fit for their purpose
- **Reference**: https://web.archive.org/web/20200101101550/https://www.iso.org/standards.html

### Types of Standards by Origin

#### De Facto Standards

- **Definition**: Arise from common usage or market acceptance
- **Examples**: The QWERTY keyboard layout, TeX, PDF (before 2008)

#### De Jure Standards

- **Definition**: Mandated by regulators at the local, state, federal, and/or international level
- **Examples**: International System of Units (SI), PDF (from 2008)

#### Voluntary Consensus Standards

- **Definition**: Specified within a range of private institutions, including engineering societies, trade associations, accredited standards-setting organizations, and industry consortia
- **Examples**: The Internet protocol suite (commonly known as TCP/IP), HTML, CSS
- **Reference**: Andrew L. Russell. Open Standards and the Digital Age. Cambridge University Press, 2014. https://arussell.org/open/

## Open Standards

### Definition Challenges

- **There is no single, universally accepted definition**
- **References**:
  - OpenStand: The Modern Paradigm for Standards (IEEE, ISOC, IETF, IAB, W3C, …) https://open-stand.org/
  - Open Standards Requirement for Software (Open Source Initiative) https://opensource.org/osr/
  - Further information: Open standard https://en.wikipedia.org/wiki/Open_standard

### General Characteristics

- **An open standard is a standard that is freely available for use and adoption to anyone**
- **Open standards are typically developed via a collaborative process**

## Web Standards Organizations

### Key Organizations

- **Ecma International**: https://www.ecma-international.org/
- **International Organization for Standardization (ISO)**: https://www.iso.org/
- **Internet Engineering Task Force (IETF)**: https://www.ietf.org/
- **Unicode Consortium**: https://unicode.org/consortium/consort.html
- **Web Hypertext Application Technology Working Group (WHATWG)**: https://whatwg.org/
- **World Wide Web Consortium (W3C)**: https://www.w3.org/

## Internet Infrastructure

### Internet Assigned Numbers Authority (IANA)

- **Purpose**: Coordinates the allocation of codes and numbers that form the basis for the operation of the Internet
- **Website**: https://www.iana.org/
- **Responsibilities**:
  - Manages the DNS root zone, and the .int and .arpa domains
  - Coordinates the allocation of IP addresses globally
  - Maintains registries of codes and numbers used in a variety of Internet protocols
- **Reference**: Protocol Registries https://www.iana.org/protocols
- **Current Operator**: IANA is a function that is currently performed by the Internet Corporation for Assigned Names and Numbers (ICANN), a not-for-profit corporation

### Internet Engineering Task Force (IETF)

- **Purpose**: An international standards organization developing Internet standards
- **Website**: https://www.ietf.org/
- **Examples**: IETF develops the Internet protocol suite (commonly known as TCP/IP)
- **Participation**: The IETF has no formal membership, no membership fee, participation is open to anyone
- **Mailing lists**: https://www.ietf.org/list/
- **Structure**: The technical work is done in working groups
- **Formation**: 1986
- **Reference**: IETF Turns 25 on 16 January 2011 https://www.ietf.org/mail-archive/web/ietf-announce/current/msg08366.html
- **Publications**: Publishes Internet standards-related specifications in the RFC series of documents

### Request for Comments (RFC)

#### Basic Information

- **Purpose**: The RFC series contains technical and organizational documents about the Internet
- **Origin**: The RFC series of documents began in 1969 as part of ARPANET project
- **First RFC**: Steve Crocker. Host Software. RFC 1, 7 April 1969. https://www.rfc-editor.org/info/rfc1
- **RFC Editor**: Edits, publishes, and catalogs RFCs. Website: https://www.rfc-editor.org/

#### RFC Streams by Origin

The RFC series is split into four streams:

1. **The Internet Engineering Task Force (IETF) Stream**
2. **The Internet Architecture Board (IAB) Stream**
3. **The Internet Research Task Force (IRTF) Stream**
4. **The Independent Submission Stream**

- **Reference**: Russ Housley (ed.), Leslie L. Daigle (ed.). The RFC Series and RFC Editor. RFC 8729, February 2020. https://www.rfc-editor.org/rfc/rfc8729

#### RFC Identification and Formats

- **Identification**: Each RFC is identified by a number, such as RFC 9110
- **ASCII Text Format**: https://www.rfc-editor.org/rfc/rfc9110.txt
- **HTML Format**: https://www.rfc-editor.org/rfc/rfc9110.html
- **Complete List**: https://www.rfc-editor.org/rfc-index.html

#### RFC Properties

- **Immutability**: Published RFCs never change
- **Error Corrections**: Various errors are fixed by errata
- **Amendments**: Can be made by writing and publishing a revised RFC
- **Relationships**: An RFC can obsolete or update earlier RFCs

#### HTTP Protocol Evolution Example

- **RFC 2068** → **RFC 2616** → **RFC 7230** → **RFC 9110**
- **RFC 7231, RFC 7232, RFC 7233, RFC 7235, RFC 7234**
- **RFC 9112, RFC 9111**

#### Important RFC Sub-series

##### Best Current Practice (BCP)

- **Purpose**: Document guidelines, processes, or the operation of the IETF itself
- **Index**: https://www.rfc-editor.org/rfc/bcp/

##### Internet Standard (STD)

- **Index**: https://www.rfc-editor.org/rfc/std/

#### BCP and STD Numbering

- **Dual Numbering**: BCPs and STDs are assigned a number in their subseries while retaining their RFC number
- **Examples**:
  - Scott O. Bradner. The Internet Standards Process – Revision 3. BCP 9, RFC 2026, October 1996. https://www.rfc-editor.org/rfc/rfc2026
  - Tim Berners-Lee, Roy T. Fielding, Larry Masinter. Uniform Resource Identifier (URI): Generic Syntax. STD 66, RFC 3986, January 2005. https://www.rfc-editor.org/rfc/rfc3986
- **Shared Numbers**: Several RFCs may share the same BCP or STD number (an STD number identifies a standard not a document)

#### Standards Track

- **Definition**: The set of maturity levels of RFCs that are intended to become Internet Standards
- **Original Maturity Levels**: Proposed Standard, Draft Standard, Internet Standard
- **Current Maturity Levels**: Proposed Standard and Internet Standard
- **References**:
  - Scott O. Bradner. The Internet Standards Process – Revision 3. BCP 9, RFC 2026, October 1996. https://www.rfc-editor.org/rfc/rfc2026
  - Russell Housley, Dave Crocker, Eric W. Burger. Reducing the Standards Track to Two Maturity Levels. BCP 9, RFC 6410, October 2011. https://www.rfc-editor.org/rfc/rfc6410

#### Internet-Drafts

- **Definition**: A draft version of a specification made available for informal review and comment during development
- **Properties**:
  - May or may not eventually be published as an RFC
  - Is subject to change or removal at any time
  - Is valid for a maximum of six months
  - Should not be cited or quoted in any formal document, except as "work in progress"
- **Example**: Austin Wright (ed.), Henry Andrews (ed.), Ben Hutton (ed.), Greg Dennis. JSON Schema: A Media Type for Describing JSON Documents. 10 June 2022. https://datatracker.ietf.org/doc/id/draft-bhutton-json-schema-01.html

#### April Fools' Day RFCs

- **Tradition**: On nearly every April 1 since 1989, one or more funny RFCs has been published
- **Example**: Jogi Hofmueller (ed.), Aaron Bachmann (ed.), IOhannes Zmoelnig (ed.). The Transmission of IP Datagrams over the Semaphore Flag Signaling System (SFSS). RFC 4824, April 1 2007. https://www.rfc-editor.org/info/rfc4824
- **Reference**: April Fools' Day Request for Comments https://en.wikipedia.org/wiki/April_Fools%27_Day_Request_for_Comments

## World Wide Web Consortium (W3C)

### Basic Information

- **Definition**: The W3C is an international community where member organizations, a full-time staff, and the public work together to develop open web standards
- **Website**: https://www.w3.org/about/
- **Publications**: W3C publishes documents called Recommendations that define Web technologies and are considered Web standards
- **Standards Page**: https://www.w3.org/standards/

### W3C Design Principles

#### Web for All

- **Principle**: The Web must be available to all people, whatever their hardware, software, network infrastructure, native language, culture, geographical location, or physical or mental ability
- **Related Concepts**: Web accessibility, internationalization

#### Web on Everything

- **Principle**: The Web must be accessible from a wide variety of devices
- **Examples**: Mobile phones, smart phones, interactive television systems, domestic appliances
- **References**:
  - Our mission – Our design principles: https://www.w3.org/mission/#principles
  - Vision for W3C: https://www.w3.org/TR/w3c-vision/

### History of the W3C

- **Foundation**: Was founded at MIT in October 1994
- **Director**: Tim Berners-Lee, the inventor and creator of the Web
- **Publications**: Has published more than 300 recommendations since 1996
- **Reference**: https://www.w3.org/TR/?status%5B0%5D=standard

### W3C Milestones

#### Early Milestones (1996-2001)

- **October 1996**: PNG (Portable Network Graphics) Specification Version 1.0
  - https://www.w3.org/TR/REC-png-961001
- **December 1996**: Cascading Style Sheets, level 1
  - https://www.w3.org/TR/REC-CSS1-961217
- **February 1998**: Extensible Markup Language (XML) 1.0
  - https://www.w3.org/TR/1998/REC-xml-19980210
- **April 1998**: Mathematical Markup Language (MathML) 1.0 Specification
  - https://www.w3.org/TR/1998/REC-MathML-19980407/
- **October 1998**: Document Object Model (DOM) Level 1 Specification
  - https://www.w3.org/TR/REC-DOM-Level-1/
- **November 1999**: XSL Transformations (XSLT) Version 1.0
  - https://www.w3.org/TR/1999/REC-xslt-19991116
- **December 1999**: HTML 4.01 Specification
  - https://www.w3.org/TR/html401/
- **January 2000**: XHTML 1.0: The Extensible HyperText Markup Language
  - https://www.w3.org/TR/2000/REC-xhtml1-20000126/
- **May 2001**: XHTML 1.1 – Module-based XHTML
  - https://www.w3.org/TR/2001/REC-xhtml11-20010531/

#### Modern Milestones (2004-2024)

- **October 2004**: XML Schema
  - https://www.w3.org/TR/xmlschema-0/
  - https://www.w3.org/TR/xmlschema-1/
  - https://www.w3.org/TR/xmlschema-2/
- **June 2011**: Cascading Style Sheets Level 2 Revision 1 (CSS 2.1) Specification
  - https://www.w3.org/TR/CSS2/
- **September 2011**: Selectors Level 3
  - https://www.w3.org/TR/2011/REC-css3-selectors-20110929/
- **June 2012**: Media Queries
  - https://www.w3.org/TR/2012/REC-css3-mediaqueries-20120619/
- **October 2014**: HTML5 – A vocabulary and associated APIs for HTML and XHTML
  - https://www.w3.org/TR/2014/REC-html5-20141028/
- **December 2019**: WebAssembly Core Specification
  - https://www.w3.org/TR/wasm-core-1/
- **April 2020**: Web of Things (WoT) Architecture
  - https://www.w3.org/TR/wot-architecture10/
- **January 2021**: WebRTC 1.0: Real-Time Communication Between Browsers
  - https://www.w3.org/TR/2021/REC-webrtc-20210126/
- **April 2022**: Media Queries Level 3
  - https://www.w3.org/TR/mediaqueries-3/
- **May 2023**: EPUB 3.3
  - https://www.w3.org/TR/epub-33/
- **August 2024**: Geolocation
  - https://www.w3.org/TR/geolocation/

### W3C Operation

#### Membership

- **Current Membership**: 347 Members from around the world (September 5, 2025)
- **Member List**: https://www.w3.org/membership/list/
- **Notable Members**: Adobe, Amazon, Apple, CERN, Google, IBM, Intel, Meta, Microsoft, SZTAKI
- **W3C Chapters**: Geographic or interest-based communities of individuals interested in W3C's activities
  - Website: https://chapters.w3.org/
  - Hungary Chapter: https://chapters.w3.org/hungary/

#### Working Groups Structure

- **Development Method**: Development is carried out by working groups
- **Deliverables**: Technical reports, test suites, and open source software
- **Current Working Groups**: 45 working groups (September 5, 2025)
- **Working Groups List**: https://www.w3.org/groups/wg/

#### Working Group Composition

Working groups are composed of experts who can be:

1. **A member of the W3C Team** (e.g., a W3C employee)
2. **An individual representing a member organization** (typically, an employee of a member organization)
3. **An individual participating as an invited expert**

#### Key Working Groups

- **Cascading Style Sheets (CSS) Working Group**: https://www.w3.org/Style/CSS/members
- **HTML Working Group**: https://www.w3.org/groups/wg/htmlwg/
- **Internationalization Working Group**: https://www.w3.org/International/i18n-activity/i18n-wg/
- **Web Applications Working Group**: https://www.w3.org/groups/wg/webapps/
- **Web Machine Learning Working Group**: https://www.w3.org/groups/wg/webmachinelearning/
