Feature: Bulk Container Creation

Scenario: Create multiple containers

When containers are bulk created
  | containerId | location |
  | C200        | B1       |
  | C201        | B2       |

Then containers should exist in inventory