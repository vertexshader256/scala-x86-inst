package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Invalidate Internal Caches
// Category: general

object INVD extends InstructionDefinition("INVD") with INVDImpl

trait INVDImpl {
  implicit object INVD_0 extends INVD._0 {
    val opcode: TwoOpcodes = (0x0F, 0x08)
  }
}
