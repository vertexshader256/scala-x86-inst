package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Invalidate Internal Caches
// Category: general

trait INVD extends InstructionDefinition {
  val mnemonic = "INVD"
}

object INVD extends ZeroOperands[INVD] with INVDImpl

trait INVDImpl extends INVD {
  implicit object INVD_0 extends _0 {
    val opcode: TwoOpcodes = (0x0F, 0x08)
        val hasRMByte = false
  }
}
