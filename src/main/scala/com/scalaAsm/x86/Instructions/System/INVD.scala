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
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0x08)
      }
}
